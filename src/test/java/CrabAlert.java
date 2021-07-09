import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;


public class CrabAlert {
    @Test
    public void Alerttest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://javascript.info/alert-prompt-confirm");

        //alert
        WebElement alertRun = driver.findElement(By.xpath("(//a[@data-action='run'])[1]"));
        alertRun.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        alertRun.click();
        System.out.println("Text from the alert —> " + alert.getText());
        alert.accept();

        //confirm

        WebElement confirmRun = driver.findElement(By.xpath("(//a[@data-action='run'])[5]"));
        confirmRun.click();

        Alert confirm = driver.switchTo().alert();
        confirm.dismiss();
        confirm.accept();

        //prompt
        WebElement promptRun = driver.findElement(By.xpath("(//a[@data-action='run'])[2]"));
        promptRun.click();

        Alert prompt = driver.switchTo().alert();
        prompt.sendKeys("28");
        prompt.accept();
        System.out.println("Text from prompt —> " + prompt.getText());
    }

}
