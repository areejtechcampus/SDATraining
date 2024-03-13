package tests.junit;

import org.apache.logging.log4j.core.appender.rolling.action.Action;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AssignSearch extends Tests {
    /* go to https://www.google.com
    * search for "Scroll Methods" by using an Actions object
     */

 @Test
 public void searchTest()   {
     driver.navigate().to("https://www.google.com");
     //search for "Scroll Methods"
     WebElement element = driver.findElement(By.xpath("//textarea[@title='Search']"));
     Actions actions = new Actions(driver);
     actions.sendKeys(element,"Scroll Methods").build().perform();


 }
}
