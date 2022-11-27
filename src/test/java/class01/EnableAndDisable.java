package class01;

import org.testng.annotations.Test;

public class EnableAndDisable {
    @Test(enabled = false)// another way to comment the line
    public void Atest() {
        System.out.println("i am a test");
    }

    @Test
    public void Btest() {
        System.out.println("i am a B test");
    }

    @Test(enabled = false)// comment the code with enable meant not allowed
    public void Ctest() {
        System.out.println("i am a C test");
    }
}
