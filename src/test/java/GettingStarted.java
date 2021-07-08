import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GettingStarted {

    @Test
    public void Randomtest1() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 10);

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");



        driver.get("https://next.privat24.ua/?lang=en");


//        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-qa-node='login']")));
//        loginButton.click();

//        WebElement inputFieldAmount = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='amount']")));
//        String defaultValue = inputFieldAmount.getAttribute("defaultValue");
//
//        System.out.println("defaultValue —> " + defaultValue);
//        Assert.assertEquals("50", defaultValue);

        WebElement linkExchangeRates = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='rates_2g6teezjyl']")));
        linkExchangeRates.click();

        WebElement buttonExchange = wait.until((ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@data-qa-node='exchange']"))));
        buttonExchange.click();

        Assert.assertTrue(wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[@data-qa-node='exchange']"))));
    }

}
