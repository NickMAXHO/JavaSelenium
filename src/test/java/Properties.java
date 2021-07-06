import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Properties {

    @Test
    public void testProperties() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");


        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.navigate().to("https://next.privat24.ua/mobile?lang=en");

        WebElement inputFieldAmount = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='amount']")));
        String defaultValue = inputFieldAmount.getAttribute("defaultValue");

        System.out.println("defaultValue —> " + defaultValue);
        Assert.assertEquals("50", defaultValue);


    }

}
