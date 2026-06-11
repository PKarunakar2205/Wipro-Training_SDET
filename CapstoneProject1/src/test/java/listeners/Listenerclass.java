package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.*;

import utilities.ExtentManager;

public class Listenerclass
implements ITestListener {

    ExtentReports extent =
    ExtentManager.getReport();

    ExtentTest test;

    @Override
    public void onTestStart(
            ITestResult result) {

        test =
        extent.createTest(
        result.getName());
    }

    @Override
    public void onTestSuccess(
            ITestResult result) {

        test.pass("Test Passed");
    }

    @Override
    public void onTestFailure(
            ITestResult result) {

        test.fail(result.getThrowable());
    }

    @Override
    public void onFinish(
            org.testng.ITestContext context) {

        extent.flush();
    }
}