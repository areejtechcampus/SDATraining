import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TeastClassStructured {
    @Test
    public void testMethod() {

        //initilaizing the session
        WebDriver driver = new ChromeDriver();
        //navigate url
        driver.get("https://www.saucedemo.com/v1/inventory.html");
        //add the first item you find to your cart


        //terminating the session
        driver.quit(); }
}