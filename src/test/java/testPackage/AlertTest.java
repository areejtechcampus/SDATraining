package testPackage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class AlertTest {
    WebDriver driver;
Wait<WebDriver> wait;

    /* Navigate to <a href="https://the-internet.herokuapp.com/javascript_alerts">Alerts</a>
     * click on "Click for JS Confirm"
     * Press OK
     * Check that "You clicked: Ok" is displayed
     */
    @Test
    public void AlertTest(){
        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
        By button = By.cssSelector("button[onclick='jsConfirm()']");
        driver.findElement(button).click();
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String text = alert.getText();
        alert.accept();
        By resultBy = By.cssSelector("p#result");
        String resultText = driver.findElement(resultBy).getText();
        Assertions.assertEquals("You clicked: OK", resultText);
    }

    @BeforeEach
    public void beforEach(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");

        driver = new ChromeDriver(chromeOptions);
    }

    @AfterEach
    public void afterEach(){
        driver.quit();
    }
}
