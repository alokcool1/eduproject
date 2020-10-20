import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
public class seleniumTest {
        public static void main(String[] args) throws IOException, InterruptedException {
                System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless");
                chromeOptions.addArguments("--no-sandbox");
                WebDriver driver = new ChromeDriver(chromeOptions);
                driver.get("http://localhost:32768");
                WebElement about = driver.findElement(By.id("About Us"));
                about.click();
                Thread.sleep(1000);
                if (driver.getPageSource().contains("Lorem Ipsum")) {
                        System.out.println("Pass");
                } else {
                        System.out.println("Fail");
                }
                driver.quit();
}
}
