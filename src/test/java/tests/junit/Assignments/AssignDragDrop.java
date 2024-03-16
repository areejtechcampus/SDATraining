package tests.junit.Assignments;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import org.testng.asserts.Assertion;
import tests.junit.Tests;

public class AssignDragDrop extends Tests {
     /*
Go to URL: http://demo.guru99.com/test/drag_drop.html
Drag and drop the BANK button to the Account section in DEBIT SIDE
Drag and drop the SALES button to the Account section in CREDIT SIDE
Drag and drop the 5000 button to the Amount section in DEBIT SIDE
Drag and drop the second 5000 button to the Amount section in CREDIT SIDE
Verify the visibility of Perfect text.
*/


@Test
public void DragDrop(){
    //Go to URL: http://demo.guru99.com/test/drag_drop.html
    driver.navigate().to("http://demo.guru99.com/test/drag_drop.html");
    Actions actions = new Actions(driver);
    //Drag and drop the BANK button to the Account section in DEBIT SIDE
    logger.info("Drag and drop the BANK button");
    By BankButton = By.xpath("//a[contains(.,'BANK')]");
    By Bank = By.id("bank");
    wait.until
            (d -> {
                        new Actions(driver).dragAndDrop(driver.findElement(BankButton), driver.findElement(Bank)).perform();
                   return true; });

    //Drag and drop the SALES button to the Account section in CREDIT SIDE
    logger.info("Drag and drop the SALES button");
    By SalesButton = By.xpath("//a[contains(.,'SALES')]");
    By Sales = By.id("loan");
    wait.until
            (d -> {
    new Actions(driver).dragAndDrop(driver.findElement(SalesButton), driver.findElement(Sales)).perform();
                return true; });
    //Drag and drop the 5000 button to the Amount section in DEBIT SIDE
    logger.info("Drag and drop the 5000 button");
    By FirstButton = By.xpath("(//li[@id ='fourth'])[1]");
    By fiestButton = By.id("amt7");
    wait.until
            (d -> {
    new Actions(driver).dragAndDrop(driver.findElement(FirstButton),driver.findElement(fiestButton)).perform();
                return true; });
    //Drag and drop the second 5000 button to the Amount section in CREDIT SIDE
    logger.info("Drag and drop the second 5000 button");
    By SecondButton = By.xpath("(//li[@id ='fourth'])[2]");
    By secondButton = By.id("amt8");
    wait.until
            (d -> {
    new Actions(driver).dragAndDrop(driver.findElement(SecondButton),driver.findElement(secondButton)).perform();
                return true; });
    //Verify the visibility of Perfect text.
    logger.info("Verify the visibility of Perfect text");
    By message = By.xpath("(//a[contains(@class, 'button-green')])");
    String actual =  driver.findElement(message).getText();

    Assertions.assertEquals(actual, "Perfect!");





}
}
