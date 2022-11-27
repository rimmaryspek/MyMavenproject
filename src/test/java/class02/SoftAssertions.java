package class02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class SoftAssertions {
    WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void LaunchThewebSite() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test(groups = "regression")
    public void LoginCredentials() {
        //user name
        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("admin");
        //login
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        //password
        password.sendKeys("adaddaad");

        WebElement logIn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        logIn.click();
//        invalid credentials
        WebElement errorMSG = driver.findElement(By.xpath("//span[text()='Invalid credentials']"));
        String ActualErrorMsg = errorMSG.getText();
        //decrliring a valiable
        String ExpectedErrorMsg = "Invalid credentials";
        //declared an instance
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(ActualErrorMsg, ExpectedErrorMsg);
        // chek if the webelement error message is Displayed
        boolean isdisplayed = errorMSG.isDisplayed();
        soft.assertTrue(isdisplayed);
        //assetr all the assertions
        soft.assertAll();
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        driver.quit();
    }

    @AfterMethod(alwaysRun = true)
    public void CloseBrowser() {
        driver.quit();
    }
}