package tests.testng;

import com.beust.jcommander.Parameter;
import engine.CustomerListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import tests.junit.Tests;
@Listeners(CustomerListener.class)
public class GoogleTests extends Tests {
    /**
     * Breakout task: 40 minutes
     * 1. recreate the base test class for junit with testng
     * 2. copy the actionsbot to your project under `src/main/java/engine`
     * 3. create a new tests.testng package
     * 4. create a new class
     * 5. do a quick google search and assert that result stats is not empty using testng
     */

    @Parameters({"search-query"})
    @Test(groups = {"sanityCheck", "quiTests"})
    public void googleSearchTest(){
        bot.navigate("https://www.google.com/");
        By googleSearchInput = By.cssSelector("textarea#APjFqb");
        bot.type(googleSearchInput, "Java"+ Keys.ENTER);

        By resultStatsText = By.cssSelector("div#result-stats");
        assert  !driver.findElement(resultStatsText).getText().isEmpty() : "result stats text is empty";
    }
}
