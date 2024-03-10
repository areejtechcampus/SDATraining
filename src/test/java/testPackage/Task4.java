package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/* Navigate to website https://testpages.herokuapp.com/styled/index.html
Under the Examples Click on Locators
- Find By Playground Test Page
Print the URL Navigate back
Print the URL Click on WebDriver
Example Page Print the URL Enter value 🡪 20 and Enter to "Enter Some Numbers inputBox" And then verify ‘two, zero’ message is displayed on page Close driver. */
public class Task4 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        WebElement locatorsLink = driver.findElement(By.linkText("Locators - Find By Playground Test Page"));
        locatorsLink.click();
        System.out.println("Current URL after clicking 'Locators' link: " + driver.getCurrentUrl());
        driver.navigate().back();
        System.out.println("Current URL after navigating back: " + driver.getCurrentUrl());
        WebElement webDriverLink = driver.findElement(By.linkText("WebDriver Example Page"));
        webDriverLink.click();
        System.out.println("Current URL after clicking 'WebDriver Example Page' link: " + driver.getCurrentUrl());
        WebElement inputBox = driver.findElement(By.id("numberInput"));
        inputBox.sendKeys("20" + Keys.ENTER);
        WebElement message = driver.findElement(By.id("msg2"));
        String actualMessage = message.getText();
        if (actualMessage.equals("two, zero")) {
            System.out.println("Verification successful: 'two, zero' message is displayed");
        } else {
            System.out.println("Verification failed: 'two, zero' message is not displayed");
        }
        driver.quit();
    }
}
