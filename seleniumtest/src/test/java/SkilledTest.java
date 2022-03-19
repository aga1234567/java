
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;
public class SkilledTest {
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
    public void sklep() {
        driver.get("http://localhost/wordpress/");
        driver.manage().window().setSize(new Dimension(1616, 886));
        {
            WebElement element = driver.findElement(By.cssSelector("#menu-item-1126 .text-wrap"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.cssSelector("#menu-item-1126 .text-wrap")).click();
        driver.findElement(By.cssSelector("#menu-item-1127 > .menu-link > .text-wrap")).click();
        driver.findElement(By.cssSelector("#menu-item-1129 .text-wrap")).click();
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.linkText("Shopping Cart")).click();
        driver.findElement(By.linkText("Contact Us")).click();
        driver.findElement(By.cssSelector("#menu-item-1042 .text-wrap")).click();
        driver.findElement(By.linkText("3 komentarze")).click();
        driver.findElement(By.id("content-wrap")).click();
    }
}
