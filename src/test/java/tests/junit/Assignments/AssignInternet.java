package tests.junit.Assignments;


import org.junit.jupiter.api.Test;
import org.testng.Assert;
import org.openqa.selenium.By;
import tests.junit.Tests;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class AssignInternet extends Tests {
    /** Go to URL: https://the-internet.herokuapp.com/windows
     * Verify the text: “Opening a new window”
     * Verify the title of the page is “The Internet”
     * Click on the “Click Here” button
     * Verify the new window title is “New Window”
     * Go back to the previous window and then verify the title: “The Internet”
     */
@Test
public void task2(){
    // Go to URL: https://the-internet.herokuapp.com/windows
    driver.navigate().to("https://the-internet.herokuapp.com/windows");
    // Verify the text: “Opening a new window”
    By newWindow = By.tagName("h3");
    Assert.assertEquals("Opening a new window", driver.findElement(newWindow).getText());

    // Verify the title of the page is “The Internet”
    assertTrue(driver.getTitle().contains("The Internet"));

    // Store the original window handle
    String originalWindowHandle = driver.getWindowHandle();

    // Click on the “Click Here” button
    driver.findElement(By.xpath("//a[@href='/windows/new']")).click();

    // Switch to new Window
    java.util.Set<String> windowHandles = driver.getWindowHandles();
    windowHandles.remove(originalWindowHandle);
    String newWindowHandle = windowHandles.iterator().next();
    driver.switchTo().window(newWindowHandle);

    // Verify the new window title is “New Window”
    assertEquals("New Window", driver.getTitle());

    // Switch back to the original window
    driver.switchTo().window(originalWindowHandle);

    // Verify the title: “The Internet”
    assertTrue(driver.getTitle().contains("The Internet"));
}
}
