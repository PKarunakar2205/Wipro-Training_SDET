package Testing_practice;

import org.testng.ITestListener;
import org.testng.ITestResult;
//onTestStart()
//onTestSuccess()
//onTestFailure()
//onTestSkipped()
//onStart()
//onFinish()
public class Listener  implements ITestListener{
	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test case started successfully");
	}
	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test case successfully completed");
	}
	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test case fail due to inturption");
	}
	@Override
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test case skipped execution ");
	}
}