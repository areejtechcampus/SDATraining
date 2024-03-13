package tests.testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import tests.junit.Tests;

public class SoftAssertion extends Tests {
    @Test
    public void softAssertionsTest() {
       /*bot.navigate("https://practicetestautomation.com/practice-test-login/");
        By usernameInput = By.id("username");
        By passwordInput = By.id("password");
        By submitButton = By.id("submit");
        JSONObject testCaseData = (JSONObject) testData.get("SoftAssertionTestData");
        bot.type(usernameInput, (String) testData.get("Username"));
        bot.type(passwordInput, (String) testData.get("Password"));
        bot.click(submitButton);

        By successfulLoginLabel = By.className("post-title");
        By congtatulationsLabel = By.tagName("strong");
        By  logButton = By.xpath("//a[contains(@href, 'practic-test-login'");

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(driver.getCurrentUrl(), "");
        softAssert.assertTrue(driver.findElement(successfulLoginLabel).isDisplayed(), "Successful Login label is not displayed!");
        softAssert.assertTrue(driver.findElement(congtatulationsLabel).isDisplayed(), "Congratulations label is not displayed!");
        softAssert.assertTrue(driver.findElement(logButton).isDisplayed(), "login button is not displayed!");
        softAssert.assertAll();*/

    }
}