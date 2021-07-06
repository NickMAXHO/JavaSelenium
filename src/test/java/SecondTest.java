import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;


public class SecondTest {

    @Test
    public void testSearchGoogle() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");

        driver.navigate().to("https://www.file.io");

        WebElement inputField = driver.findElement(By.xpath("//input[@type=\"file\"]"));
        inputField.sendKeys("D:/JavaSelenium/Example.html");
    }

}
