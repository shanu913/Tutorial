package Automation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class CustomeListner extends TestListenerAdapter 
{
	public void onTestFailure(ITestResult tr)
	{
		File scrFile = ((TakesScreenshot)Assert.driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		try {
			FileUtils.copyFile(scrFile, new File("E:\\raging-bull\\" + tr.getName() + " .png "));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
}
