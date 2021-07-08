import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HiddenElement {
    @Test
    public void HiddenElementOk() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.get("https://developer.mozilla.org/ru/docs/Web/API/HTMLElement/hidden");

        driver.switchTo().frame("frame_Example");

        WebElement okayButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='okButton']")));
//        okayButton.click();

        WebElement textWelcome = wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//div[Wid='awesome']"))));
        Assert.assertEquals("Thanks!", textWelcome.getText());

    }
}
