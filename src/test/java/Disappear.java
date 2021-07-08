import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Disappear {

    @Test
    public void DisappearTest() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.get("https://next.privat24.ua/money-transfer/card?lang=en");

        WebElement addCommentLink = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@data-qa-node='toggle-comment']")));
        addCommentLink.click();

        WebElement commentField = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//textarea[@data-qa-node='comment']")));

        WebElement closeButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@title='Close']")));
        closeButton.click();

        Assert.assertTrue(wait.until(ExpectedConditions.stalenessOf(commentField)));

    }

}
