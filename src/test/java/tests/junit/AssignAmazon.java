package tests.junit;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;


import java.io.File;
import java.io.IOException;

public class AssignAmazon extends Tests{
    /* Go to amazon.com
    * Take full page Screenshot
    * Take any spesific WebElement Screenshot
    */

    @Test
    public void testAmazon() throws IOException {
        driver.get("https://www.amazon.com/s?k=easter&_encoding=UTF8&content-id=amzn1.sym.3965ebf9-4ea1-4060-84e2-827f90194076&pd_rd_r=c049654d-f30f-4f7f-b1a6-fb9540f183b8&pd_rd_w=nstUS&pd_rd_wg=fmBQ4&pf_rd_p=3965ebf9-4ea1-4060-84e2-827f90194076&pf_rd_r=KXEXT771KYH90958B7XN");

        try {
            // Take full page screenshot
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileHandler.copy(src, new File("img1.png"));

            // Try to find the element
            WebElement element = driver.findElement(By.id("nav-logo"));

            // If element is found, take screenshot of it
            File src2 = element.getScreenshotAs(OutputType.FILE);
            FileHandler.copy(src2, new File("img2.jpg"));
        } catch (NoSuchElementException e) {
            // Handle NoSuchElementException gracefully
            System.out.println("Element with ID 'nav-logo' not found on the page.");
            e.printStackTrace();
        } catch (IOException e) {
            // Handle IOException if file copying fails
            System.out.println("Failed to copy file.");
            e.printStackTrace();
        }
    }
}