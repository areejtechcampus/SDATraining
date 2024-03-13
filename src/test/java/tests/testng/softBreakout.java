package tests.testng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.junit.Tests;
import org.testng.asserts.SoftAssert;

public class softBreakout extends Tests {
/* Breakout session: 30 min
* navigate to https://practicetestautomation.com/practice-test-login/
* login using "Username": "student" + "Password123" (using testdata.json is optional)
* check that the url is correct "https://practicetestautomation.com/logged-in-successfully/"
* check the successful login, congratulations message, and logout button are displayed
 */
    @Test
    public void  softTest(){
        bot.navigate("https://practicetestautomation.com/practice-test-login/");
        By usernameInput = By.id("username");
        By passwordInput = By.id("password");

        bot.type(usernameInput, "student");
        bot.type(passwordInput, "Password123");
        bot.click(By.id("sumbit"));

        Assert.assertEquals(driver.getCurrentUrl(), "");
        Assert.assertTrue(driver.findElement(By.className("post-title")).isDisplayed());


    }
}
