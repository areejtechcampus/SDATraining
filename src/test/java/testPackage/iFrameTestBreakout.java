package testPackage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class iFrameTestBreakout {
    WebDriver driver;

    /*navigate ("https://www.selenium.dev/selenium/web/click_frames.html")
     * assert the value of the h1 element
     */
@Test
public void iframetest() {
    driver.navigate().to("https://www.selenium.dev/selenium/web/click_frames.html");
    var headerText = driver.findElement(By.tagName("h1")).getText();
    Assertions.assertEquals("Testing Clicks", headerText);

}
@BeforeEach
public void beforEach(){
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.addArguments("start-maximized");

    driver = new ChromeDriver(chromeOptions);
}

@AfterEach
public void afterEach(){
    //driver.quit();
}
}