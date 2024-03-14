package tests.testng;

import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import tests.testng.Tests;
public class SoftAssertion extends tests.testng.Tests {
    @Test
    public void softAssertionsTest() {
      bot.navigate("https://practicetestautomation.com/practice-test-login/");
        By usernameInput = By.id("username");
        By passwordInput = By.id("password");
        By submitButton = By.id("submit");
        JSONObject testCaseData = (JSONObject) testData.get("SoftAssertionsTestData");
        bot.type(usernameInput, (String) testCaseData.get("Username"));
        bot.type(passwordInput, (String) testCaseData.get("Password"));
        bot.click(submitButton);

        By successfulLoginLabel = By.className("post-title");
        By congtatulationsLabel = By.tagName("strong");
        By  logButton = By.xpath("//a[contains(@href, 'https://practicetestautomation.com/practice-tes')]");

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(driver.getCurrentUrl(), "https://practicetestautomation.com/logged-in-successfully/");
        softAssert.assertTrue(driver.findElement(successfulLoginLabel).isDisplayed(), "Successful Login label is not displayed!");
        softAssert.assertTrue(driver.findElement(congtatulationsLabel).isDisplayed(), "Congratulations label is not displayed!");
        softAssert.assertTrue(driver.findElement(logButton).isDisplayed(), "login button is not displayed!");
        softAssert.assertAll();

    }
}