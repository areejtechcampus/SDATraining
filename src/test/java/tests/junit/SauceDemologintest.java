package tests.junit;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *  Navigate to <a href="https://www.saucedemo.com/v1/index.html">SauceDemo</a>
 *  login as standard_user
 *  assert(check) that there are 6 items on the products list page
 *  add the first and last items to the cart
 *  navigate to the cart and check that both items are listed
 */
public class SauceDemologintest {

    WebDriver driver;
    @Test
    public void checkitem(){
        login("standard_user", "secret_sauce");
        By productlist = By.xpath("//div[@class='inventory_item_name']");
        int size = driver.findElements(productlist).size();
        Assertions.assertEquals(6, size);
    }
    @Test
    public void addfirstitem(){
   By additem = null;
   driver.findElement(additem).click();
        By additem2 = null;
        driver.findElement(additem2).click();
   driver.navigate().to("https://www.saucedemo.com/v1/cart.html");
   By checkitem = null;
   String chkitem = driver.findElement(checkitem).getText();
   Assertions.assertEquals("Sauce Labs Backpack", chkitem);

    }
    @Test
    public void addlastitem(){
        By additem = null;
        driver.findElement(additem).click();
        By additem2 = null;
        driver.findElement(additem2).click();
        driver.navigate().to("https://www.saucedemo.com/v1/cart.html");
        By checkitem = null;
        String chkitem = driver.findElement(checkitem).getText();
        Assertions.assertEquals("Test.allTheThings() T-Shirt (Red)", chkitem);

    }


private void login(String username, String password){
        By usernametext = By.id("") ;
        By passwordtext = By.id("");
        By loginbutton = By.id("");
        driver.findElement(usernametext).sendKeys(username);
        driver.findElement(passwordtext).sendKeys(password);
        driver.findElement(loginbutton).click();

    }
    @BeforeEach
    public void beforeach(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/v1/index.html");
    }
    @AfterEach
    public  void aftereach(){
        driver.quit();
    }
}





