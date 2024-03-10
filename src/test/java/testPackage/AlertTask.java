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
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/** /Go to URL: http://demo.automationtesting.in/Alerts.html
 * Click "Alert with OK" and click 'click the button to display an alert box
 * Accept Alert(I am an alert box!) and print alert on console.
 * /Click "Alert with OK & Cancel
 *  and click 'click the button to display a conform box
 *  Cancel Alert (Press a Button !)
 *  Click "Alert with Textbox" and click 'click the button to demonstrate the prompt box’
 *  And then sendKeys «Bootcamp» (Please enter your name)
 *  Finally print on console this message "Hello Bootcamp How are you today" assertion these message
 */
public class AlertTask {
    WebDriver driver;
    Wait<WebDriver> wait;
    private  Alert alert;
    @Test
    public void task() {
        driver.navigate().to("https://demo.automationtesting.in/Alerts.html");

        By alertOK = By.cssSelector("button[onclick='alertbox()']");

        driver.findElement(alertOK).click();
        alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();

        By CancleTab = By.xpath("(//a[@class='analystic'])[2]");
        driver.findElement(CancleTab).click();

        By confirmbox = By.cssSelector("button[onclick='confirmbox()']");
        driver.findElement(confirmbox).click();
        alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.dismiss();
        By message =By.xpath("//p[@id='demo']");
        String actualMessage = driver.findElement(message).getText();
        System.out.println(actualMessage);



        By Textbox = By.cssSelector("a[href='#Textbox'");
        driver.findElement(Textbox).click();

        By TextBoxLink =  By.cssSelector("button[onclick='promptbox()']");
        driver.findElement(TextBoxLink).click();
        alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.sendKeys("Areej");
        alert.accept();


        By message1 = By.xpath("//p[@id='demo1']");
        String actualMessage1 = driver.findElement(message1).getText();
        System.out.println(actualMessage1);
        Assertions.assertEquals("Hello Areej How are you today", actualMessage1);
    }

    @BeforeEach
    public void beforeach() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @AfterEach
    public void aftereach() {
        driver.quit();
    }
}