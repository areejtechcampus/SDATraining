package testPackage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import  org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;


/**  navigate to https://www.selenium.dev/selenium/web/droppableItems.html
 * drag the draggable, onto the droppable
 * check that the text now shows "Dropped!"
 */
public class BreakoutTaskDropDrag  extends Tests{
    WebDriver driver;

@Test
public  void DropDrag(){
driver.navigate().to("https://www.selenium.dev/selenium/web/droppableItems.html");
    WebElement drag = driver.findElement(By.id("drag"));
    WebElement drop = driver.findElement(By.id("drop"));

    new Actions(driver).dragAndDrop(drag , drop).perform();
    String textAfterDrop = drop.getText();
    Assertions.assertEquals("Dropped!", textAfterDrop);
}
}
