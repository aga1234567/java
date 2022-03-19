
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class Test4 {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @BeforeEach
    public void setUp() {
        driver = new FirefoxDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @AfterEach
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void test4() {
        driver.get("https://www.wp.pl/?abtest=adtech%7CFAPO-637%7CA%3Banalytics%7CANALIZY-2628%7Ctest%3Aparent%3Astatid-parent%2F44%3Bapplication%7CPBDWK-132%7CA");
        driver.manage().window().setSize(new Dimension(1074, 750));
        driver.findElement(By.cssSelector(".arqs8k-0 path:nth-child(2)")).click();
        driver.findElement(By.cssSelector(".arqs8k-0")).click();
        driver.findElement(By.id("password")).sendKeys("0987Diana...");
        driver.findElement(By.id("login")).sendKeys("aga.jazz");
        driver.findElement(By.cssSelector(".styled__SubmitButton-sc-1bs2nwv-2")).click();
        js.executeScript("window.scrollTo(0,1)");
        driver.findElement(By.id("Logout-Button")).click();
    }
}
