package tests.junit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;


/**
 *  navigate to <a href="https://the-internet.herokuapp.com/upload">Upload Test</a>
 *   uploading any file from your machine (make it small please)
 *   checking to see that the file was successfully uploaded
 */
public class UploadFile extends Tests {


@Test
public void UploadFileTest(){

    String url = "https://the-internet.herokuapp.com/upload";
    logger.info("Navigate to: "+url);
    driver.get(url);
    driver.get("https://the-internet.herokuapp.com/upload");
    By fileUpladInput = By.xpath("(//input[@type='file'])[1]");

    driver.findElement(fileUpladInput).sendKeys("C:\\Users\\Areej\\Desktop\\Splunk_commands.pdf");
    logger.info("Uploading file: "+fileUpladInput);
    driver.findElement(fileUpladInput).submit();
    //Assertions.assertTrue();

}
}
