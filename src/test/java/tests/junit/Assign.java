package tests.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Assign {
    WebDriver driver;
    Select select;
    boolean isSelected;

    /**
     * Go to URL: https://demoqa.com/radio-button
     * Verify whether all 3 options given to the question can be selected.
     * When each option is selected, print the following texts on the console.
     */
    @Test
    public void checkBoxtest1() {
        //check the box and validate that is checked
        By checkBox1 = By.xpath("//label[@class='custom-control-label' and @for='yesRadio']");
        driver.findElement(checkBox1).click();
        isSelected = driver.findElement(checkBox1).isSelected();
        Assertions.assertTrue(isSelected);
    }

    @Test
    public void checkBoxtest2() {
        //check the radio and validate that is checked
        By checkBox2 = By.xpath("//label[@for='Impressive']");
        driver.findElement(checkBox2).click();
        isSelected = driver.findElement(checkBox2).isSelected();
        Assertions.assertTrue(isSelected);
    }
        @Test
        public void checkBoxtest3() {
            By checkBox3 = By.xpath("//label[@for='No']");
            driver.findElement(checkBox3).click();
            isSelected = driver.findElement(checkBox3).isSelected();
            Assertions.assertTrue(isSelected);
        }

@BeforeEach
public void beforeach() {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.navigate().to("https://demoqa.com/radio-button");
}
   @AfterEach
    public void aftereach(){
        //driver.quit();
   }
}