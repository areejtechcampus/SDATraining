import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 {
    @Test
    public void test() {
        //initilaizing the session
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //initial navigation
        driver.navigate().to("https://www.selenium.dev/selenium/web/web-form.html");
    }
}
