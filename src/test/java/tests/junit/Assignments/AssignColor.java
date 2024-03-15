package tests.junit.Assignments;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import tests.junit.Tests;

import java.time.Duration;

public class AssignColor extends Tests {
    /**
     * Go to URL: https://api.jquery.com/dblclick/
     * Double click on the blue square at the bottom of the page and then write the changed color.
     * Go top of the page and sendKeys "Thanks to JavascriptExecutor"
     * Go to the bottom of the page and click the book, name"jQuery in Action"
     */


    @Test
    public void dbClick() {
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            // Go to URL: https://api.jquery.com/dblclick/
            driver.get("https://api.jquery.com/dblclick/");

            // Double click on the blue square at the bottom of the page and then write the changed color.
            WebElement blueSquare = driver.findElement(By.cssSelector("body>div"));
            actions.doubleClick(blueSquare).perform();
            String changedColor = blueSquare.getCssValue("background-color");
            System.out.println("Changed color: " + changedColor);

            // Go to the top of the page and sendKeys "Thanks to JavascriptExecutor"
            js.executeScript("window.scrollTo(0, 0)");
            WebElement body = driver.findElement(By.tagName("body"));
            js.executeScript("arguments[0].innerText = 'Thanks to JavascriptExecutor'", body);
            // Go to the bottom of the page and click the book named "jQuery in Action"
            WebElement book = driver.findElement(By.xpath("//a[@href='https://www.manning.com/books/jquery-in-action-third-edition']"));
            js.executeScript("arguments[0].scrollIntoView();", book);
            book.click();
            // Verify the current URL after clicking the book link
            String currentURL = driver.getCurrentUrl();
            Assertions.assertEquals("https://www.manning.com/books/jquery-in-action-third-edition", currentURL);
        } catch (NoSuchElementException e) {
            // Handle the NoSuchElementException and print an error message
            System.err.println("Element not found: " + e.getMessage());
        } finally {
            // Quit the WebDriver instance to close the browser
            driver.quit();
        }
    }
}