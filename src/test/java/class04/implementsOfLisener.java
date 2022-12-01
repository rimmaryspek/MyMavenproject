package class04;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class implementsOfLisener implements ITestListener {
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("the test case pass is successfully passed"+result.getName());
    }
    @Override
  public void  onTestFailure(ITestResult result) {
        System.out.println("the test case pass is successfully failed"+result.getName());
    }
}
