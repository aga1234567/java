

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
public class Test3Test {
    private WebDriver driver;
//    private Map<String, Object> vars;
//    JavascriptExecutor js;
//    @Before
//    public void setUp() {
//        driver = new ChromeDriver();
//        js = (JavascriptExecutor) driver;
//        vars = new HashMap<String, Object>();
//    }
//    @After
//    public void tearDown() {
//        driver.quit();
  //  }
    @Test
    public void test3() {
        driver.get("https://www.google.pl/?gws_rd=ssl");
        driver.manage().window().setSize(new Dimension(1295, 730));
       // driver.findElement(By.cssSelector("#L2AGLb > .jyfHyd")).click();
        //driver.findElement(By.name("Zgadzam się")).click();
        WebElement searchField = driver.findElement(By.cssSelector("[id='L2AGLb']"));
        driver.findElement(By.cssSelector("L2AGLb")).click();
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).sendKeys("dupa");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }
}
