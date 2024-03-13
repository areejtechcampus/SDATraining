package tests.junit;

import org.testng.annotations.Test;
import org.openqa.selenium.Cookie;

public class AssignCookie extends Tests {
    /* Go to URL: http://facebook.com
    * getCookies,
    * addCookie,
    * deleteCookieNamed,
    * deleteAllCookies
     */
    @Test
    public void assignCookie(){
        driver.get("http://facebook.com");
        //get all cookies
        driver.manage().getCookies();
        //addCookie
        Cookie newCookie = new Cookie("email", "password");
        driver.manage().addCookie(newCookie);
        //deleteCookieNamed
        driver.manage().deleteCookieNamed("email");
        //deleteAllCookies
        driver.manage().deleteAllCookies();

    }
}
