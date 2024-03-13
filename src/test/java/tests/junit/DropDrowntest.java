package tests.junit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/** https://demoqa.com/select-menu
 * Get all the options of the dropdown
 * Options size
 * Print all test
 * Verify the dropdown has option "Black"
 * Print FirstSelectedOptionTest
 * Select option "Yellow"
 */
public class DropDrowntest {


    @Test
    public void dropdown() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        WebElement dropdown = driver.findElement(By.id("oldSelectMenu"));
        Select select = new Select(dropdown);
        //all options of the dropdown

        List<WebElement> options = select.getOptions();
        System.out.println("All options:");
        for (WebElement option : options)
            System.out.println(option.getText());


        //option size
        int optionNum = options.size();
        System.out.println("The number of options: " + optionNum);
        //verify the dropdown has option "Black"
        WebElement black = driver.findElement(By.id("oldSelectMenu"));
        System.out.println(black.getText().contains("Black"));


        //Print FirstSelectedOptionTest
        WebElement first = select.getFirstSelectedOption();
        System.out.println("first selected option: " + first.getText());

        //Select option "Yellow"
        select.selectByVisibleText("Yellow");
        System.out.println("option Yellow Selected");
    }
}