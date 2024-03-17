package tests.junit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InterdependentTest {


    /* Create tests that depend on each other
     * Create beforeClass and set up settings
     *  By creating interdependent tests;First go to Facebook.
     * Then go to Google depending on Facebook,
     * Then go to Amazon depending on Google
     *  Close the driver
     */
    static WebDriver driver;

    @BeforeClass
    public static void setUp() {

        driver = new ChromeDriver();

    }
    //By creating interdependent tests;First go to Facebook
    @Test
    public void FacebookTest() {
        // Navigate to Facebook
        driver.get("https://www.facebook.com");
    }

    //Then go to Google depending on Facebook,
    @Test(dependsOnMethods = "FacebookTest")
    public void GoogleTest() {
        driver.get("https://www.google.com");
    }
    //Then go to Amazon depending on Google
    @Test(dependsOnMethods = "GoogleTest")
    public void AmazonTest() {
        driver.get("https://www.amazon.com");
        driver.quit();
    }
}