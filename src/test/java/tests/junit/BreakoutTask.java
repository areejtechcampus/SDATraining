package tests.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class BreakoutTask {
    WebDriver driver;
    @Test
    public void login() {
        login("standard_user", "secret_sauce");

    }

private void login(String username, String password){
    By usernametext = By.id("") ;
    By passwordtext = By.id("");
    By loginbutton = RelativeLocator.with(By.tagName("input")).below(passwordtext);
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
