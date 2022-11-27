package class01;

import org.testng.annotations.Test;

public class DependsOn {
    @Test
    public void Login() {
        System.out.println("after login in a am verifying the login page");
        // System.out.println(4/0); testing
    }

    @Test(dependsOnMethods = {"Login"})// gives us dependency with first method, its gonna give us stop running/ignored
    public void dashBordVerificatoin() {
        System.out.println("after login in a am verifying the dashbord page");

    }
}
