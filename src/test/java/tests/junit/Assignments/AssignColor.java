package tests.junit.Assignments;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import tests.junit.Tests;

import java.time.Duration;

public class AssignColor extends Tests {
    /** Go to URL: https://api.jquery.com/dblclick/
     * Double click on the blue square at the bottom of the page and then write the changed color.
     * Go top of the page and sendKeys "Thanks to JavascriptExecutor"
     * Go to the bottom of the page and click the book, name"jQuery in Action"
     */


    @Test
    public void dbClick(){
        Actions actions = new Actions(driver);
        //Go to URL: https://api.jquery.com/dblclick/
        driver.navigate().to("https://api.jquery.com/dblclick/");



        WebElement dbclickElement = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(dbclickElement);
        actions.doubleClick(dbclickElement).perform();
        //Double click on the blue square at the bottom of the page and then write the changed color.
        WebElement blueColour = driver.findElement(By.tagName("div"));

        actions.doubleClick(blueColour).perform();
        String changedColor = blueColour.getCssValue("background-color");
        System.out.println("Changed color: " + changedColor);

        // Go top of the page and sendKeys "Thanks to JavascriptExecutor"
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement body = driver.findElement(By.tagName("body"));
       js.executeScript("arguments[0].innerText = 'Thanks to JavascriptExecutor'", body);

        //Go to the bottom of the page and click the book, name"jQuery in Action"
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement book = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='https://www.manning.com/books/jquery-in-action-third-edition']")));
        book.click();



    }
    }

