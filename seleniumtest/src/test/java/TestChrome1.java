
import org.junit.jupiter.api.Test;
import org.openqa.selenium.interactions.Actions;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
public class TestChrome1 {
        private WebDriver driver;
        private Map<String, Object> vars;
        JavascriptExecutor js;
//        @Before
//        public void setUp() {
//            driver = new ChromeDriver();
//            js = (JavascriptExecutor) driver;
//            vars = new HashMap<String, Object>();
//        }
//        @After
//        public void tearDown() {
//            driver.quit();
      //  }
        @Test
        public void chrometest1() {
            driver.get("https://google.pl/");
            driver.manage().window().setSize(new Dimension(1295, 730));
            driver.findElement(By.cssSelector("#L2AGLb > .jyfHyd")).click();
            {
                WebElement element = driver.findElement(By.cssSelector("#L2AGLb"));
                Actions builder = new Actions(driver);
                builder.moveToElement(element).perform();
            }
            {
                WebElement element = driver.findElement(By.tagName("body"));
                Actions builder = new Actions(driver);
                builder.moveToElement(element, 0, 0).perform();
            }
            {
                WebElement element = driver.findElement(By.cssSelector("center:nth-child(1) > .RNmpXc"));
                Actions builder = new Actions(driver);
                builder.moveToElement(element).perform();
            }
            {
                WebElement element = driver.findElement(By.tagName("body"));
                Actions builder = new Actions(driver);
                builder.moveToElement(element, 0, 0).perform();
            }
            driver.findElement(By.name("q")).click();
            driver.findElement(By.name("q")).sendKeys("duoa");
            driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
            driver.findElement(By.cssSelector("div:nth-child(2) > .tF2Cxc .LC20lb")).click();
        }
    }
