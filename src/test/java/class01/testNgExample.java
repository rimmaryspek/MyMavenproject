package class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class testNgExample {
    static WebDriver driver;

    //precondition for test case
    @BeforeMethod
    public void SetUpBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    //post conditons for all test case
    @AfterMethod
    public void closeBrowser() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
        driver.quit();
    }

    //    ----Test1---
//    goto syntax Hrms
//    enter the username and password , verify that u logged in
//    close the browser
    @Test
    public void LoginFunctionality() {
        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("admin");
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement logIn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        logIn.click();
    }

    //    ----Test2---
//    goto syntax Hrms
//    verify the  password is there
//    close the browser
    @Test
    public void PsswordBoxVerification() {

        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        System.out.println(password.isDisplayed());

    }

}


