package tests.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartTest {
    WebDriver driver;


    @Test
public void addItemtoCart(){
    driver.navigate().to("https://www.saucedemo.com/v1/inventory.html");
    By firstCartItemName = By.xpath("//div[@class='inventory_item_name']");
    var actualFirstItemName = driver.findElement(firstCartItemName).getText();
    Assertions.assertEquals("Sauce labs backup", actualFirstItemName);
    }
    @BeforeEach
    public  void  beforeach(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterEach
    public  void  aftereach(){
        driver.quit();
    }
}
