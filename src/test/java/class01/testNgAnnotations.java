package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNgAnnotations {
    // first test case
    @Test
    public void firstTestCase() {
        System.out.println("i am the first test case");
    }

    @Test
    public void secondTestCase() {
        System.out.println("i am the second test case");
    }

    @Test
    public void thirdTestCase() {
        System.out.println("i am the third test case");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("i am before method");

    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("i am after each test case");
    }
}

