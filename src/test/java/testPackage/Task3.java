package testPackage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Invoke Chrome Driver
 * Navigate to Facebook homepage URL: https://www.facebook.com/
 * Verify expected URL equals to the actual URL.
 * Verify pagesource of FaceBook contains "Facebook"
 */
public class Task3 {
    WebDriver driver = new ChromeDriver();
    @Test
    public void task3 (){
        driver.navigate().to("https://www.facebook.com/");
        String actualUrl = driver.getCurrentUrl();
        Assertions.assertEquals("https://www.facebook.com/", actualUrl);

        String pageSource = driver.getPageSource();
        Assertions.assertTrue(pageSource.contains("Facebook"));

    }
}
