package class03;

import org.testng.annotations.*;

public class Annotations {
    @BeforeTest
    public void beforeTest(){
        System.out.println("i am before test");
    }
    @AfterTest
    public  void AfterTest(){
        System.out.println("i am after test");
    }
@BeforeClass
public void BeforeClass(){
    System.out.println("i am before class");
}
    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("i am the before method");
    }

    @Test
    public void AFirstTest() {
        System.out.println("i am the first test");
    }

    @Test
    public void BFirstTest() {
        System.out.println("i am the second test");

    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("i am the after method");
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("i am the after class");
    }

}