package class01;

import org.testng.annotations.Test;

public class Priority {
    @Test(priority = 2,groups = "regression")
    public void Atest() {
        System.out.println("i am a A Test");
    }

    @Test(priority = 1)
    public void Btest() {
        System.out.println("i am a B Test");
    }

    @Test(priority = 3)
    public void Ctest() {
        System.out.println("i am a C Test");
    }

    @Test(priority = 0)
    public void Dtest() {
        System.out.println("i am a D Test");
    }
}
