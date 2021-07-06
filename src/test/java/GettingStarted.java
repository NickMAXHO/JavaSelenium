import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.Set;


public class GettingStarted {

    @Test
    public void Randomtest1() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");


//        driver.navigate().to("https://en-gb.facebook.com");
//        WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
//        loginButton.submit();

//        WebElement createAccButton = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
//        createAccButton.click();




    }

}
