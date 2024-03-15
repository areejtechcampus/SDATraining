package tests.junit.Assignments;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import tests.junit.Tests;

public class AssignActions extends Tests {
    /** go to https://www.google.com/
     * search for "Scroll Methods" by using an Actions object
     */


@Test
public void assign4(){
    //go to https://www.google.com/
    driver = new ChromeDriver();
    Actions actions = new Actions(driver);
driver.navigate().to("https://www.google.com/");
    WebElement searchInput = driver.findElement(By.id("APjFqb"));
    //search for "Scroll Methods" by using an Actions object
    searchInput.sendKeys("Scroll Methods");
    searchInput.submit();

}
}

