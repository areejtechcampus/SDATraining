package tests.junit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class iFrame1 {
    WebDriver driver;

@Test
public void Ifarme() {
    driver.navigate().to("https://www.selenium.dev/selenium/web/click_frames.html");
}
}


