package testPackage;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;

public class Cookies extends Tests{
    /**
     *  Navigate to <a href="https://kitchen.applitools.com/ingredients/cookie">Cookies</a>
     *   print the total number of cookies
     *    add a new "fruit=apple" cookie
     *    edit the "protein" cookie to have the value "meat"
     *     delete the "vegetable" cookie
     *     print all cookies
     *      delete all cookies
     */

    @Test
    public void  CookiesTest(){
        driver.navigate().to("https://kitchen.applitools.com/ingredients/cookie");
       var cookies = driver.manage().getCookies();
        //print the total number of cookies
        System.out.println("Total no of cookies: " + cookies.size());
        //add a new "fruit=apple" cookie
        driver.manage().addCookie(new Cookie("fruit", "apple"));
        driver.manage().addCookie(new Cookie("protein", "meat"));
        //edit the "protein" cookie to have the value "meat"
        driver.manage().deleteCookieNamed("vegertable");
        System.out.println("All Cookie");
        driver.manage().getCookies().forEach(System.out::println);
        driver.manage().deleteAllCookies();
    }
}
