import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;


public class FirstTest {

    @Test
    public void testSearchGoogle() {

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

         driver.get("http://google.com");
//        driver.navigate().to("http://google.com");

//        Set<String> oldWindow =   driver.getWindowHandles();
//        System.out.println("oldWindow->" + oldWindow);
//
//        ((JavascriptExecutor)driver).executeScript("window.open()");
//        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
//
//        driver.switchTo().window(tabs.get(1));
//        driver.get("https://selenium.dev");
//
//        Set<String> newWindow = driver.getWindowHandles();
//        System.out.println("newWindow->" + newWindow);
//
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("ChromeDriver");
        searchBox.submit();

//        driver.get("https://github.com/NickMAXHO");
//        driver.manage().addCookie(new Cookie("user_session","uDOYKQQFr9xevDQ4loGkIxx2HEhAzt3hVB6DzGHEFEeq5xgB"));
//        driver.navigate().refresh();

//        Set <Cookie> cookies = driver.manage().getCookies();
//        System.out.println("cookies —>" + cookies);

//        Cookie tz = driver.manage().getCookieNamed("tz");
//        driver.manage().deleteCookieNamed("tz");
//        driver.manage().deleteCookieNamed("domain=");
//        driver.manage().deleteCookieNamed("_octo");
//        System.out.println("All Cookies —>" + driver.manage().getCookies());

//        String currentURL = driver.getCurrentUrl();
//        System.out.println("currentURL —>" + currentURL );
//        Assert.assertEquals(currentURL, "http://google.com");

//        String pageSource = driver.getPageSource();
//        System.out.println("PageSource —> " + pageSource);

//        driver.navigate().to("https://selenium.dev");
//        driver.navigate().back();
//
//        String currentTitle = driver.getTitle();
//        System.out.println("currentTitle —> " + currentTitle);
//        Assert.assertEquals(currentTitle, "ChromeDriver - Поиск в Google");
//
//        driver.navigate().forward();
//
//        String currentTitle1 = driver.getTitle();
//        System.out.println("currentTitle —> " + currentTitle1);
//        Assert.assertEquals(currentTitle1, "SeleniumHQ Browser Automation");




        driver.quit();  // закрыть окно браузера

    }

}
