package tests.junit;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClass {

        @Test
        public  void testMethod(){
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com");
            driver.getTitle();
            //driver.quit();

        }

    }

