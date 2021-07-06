import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import java.util.Set;


public class GoogleSearch {

    @Test
    public void testSearchGoogle() throws InterruptedException{

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://google.com/222");

//        WebElement searchBox = driver.findElement(By.name("q"));
//        searchBox.sendKeys("ChromeDriver");
//        searchBox.submit();

        Set<String> allLogsType = driver.manage().logs().getAvailableLogTypes();
        System.out.println("allLogsType —>" + allLogsType);

        LogEntries logs = driver.manage().logs().get(LogType.BROWSER);
        for (
            LogEntry entry: logs
        )
        System.out.println("Logs —>" + entry);
    }

}
