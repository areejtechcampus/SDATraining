package testPackage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

/** Use Google Chrome
 * Navigate to <a href="https://www.google.com/">Google.com</a>
 * Search for "Selenium"
 * Check that results stats is not empty
 * Change to using Firefox
 */
public class SynchronizationTest {
    WebDriver driver;


    @BeforeEach
    public void beforeEach() {

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    public void afterEach(){
        driver.quit();

    }
    @Test
    public void firefoxTest(){
        driver.navigate().to("https://www.google.com/");
        By searchBox = By.id("APjFqb");
        driver.findElement(searchBox).sendKeys("Selenium" + Keys.RETURN);
        //insert syn point here
        //Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        By resultStats = By.id("result-stats");
        String actualText = driver.findElement(resultStats).getText();
        Assertions.assertNotEquals("", actualText);
    }
}
