package engine;

import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.Arrays;

public class CustomerListener implements ITestListener {
    public void onTestFailure(ITestResult result) {
        System.out.println(result.getInstanceName()+ "." + result.getName() + "FAILED");

    }
    public void onTestSuccess(ITestResult result) {
        System.out.println(result.getInstanceName() +"." + result.getName() + "PASSED");
    }
    public void afterGetText(WebElement element, String result) {
        var screenshot = element.getScreenshotAs(OutputType.BYTES);
        Allure.addAttachment("screenshot", Arrays.toString(screenshot));
    }
}
