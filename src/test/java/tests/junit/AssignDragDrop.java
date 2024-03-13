package tests.junit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

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
    By BankButton = By.id("credit2");
    By accountDebit = By.id("shoppingCart1");


    //Drag and drop the SALES button to the Account section in CREDIT SIDE
    By SalesButton = By.id("credit1");
    By accountCredit = By.id("shoppingCart3");

    //Drag and drop the 5000 button to the Amount section in DEBIT SIDE
    By NumButton = By.id("fourth");
    By AmountDebit = By.id("mt7");

    //Drag and drop the second 5000 button to the Amount section in CREDIT SIDE
    By secondNumButton = By.id("fourth");
    By AmountCredit = By.id("mt8");







}
}
