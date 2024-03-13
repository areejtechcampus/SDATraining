package tests.junit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AssignActions extends Tests {
    /** go to https://www.google.com/
     * search for "Scroll Methods" by using an Actions object
     */
    Actions actions = new Actions(driver);
@Test
public void assign4(){
    //go to https://www.google.com/
driver.navigate().to("https://www.google.com/");
    WebElement searchInput = driver.findElement(By.id("APjFqb"));
    //search for "Scroll Methods" by using an Actions object
    actions.sendKeys(searchInput, "Search Methods").sendKeys(Keys.ENTER);

}
}

