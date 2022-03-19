
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dodaj {
    WebDriver driver;
    @BeforeEach
            public void driverBefore() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1050, 850));
    }
  @AfterEach
  public void driverQuit(){
    driver.quit();
}

        @Test
        public void demoTest(){

            driver.get("http://localhost/wordpress/");
            driver.findElement(By.cssSelector("#menu-main-menu .site-search-toggle")).click();
            driver.findElement(By.id("ocean-search-form-1")).sendKeys("suknia");
            driver.findElement(By.id("ocean-search-form-1")).sendKeys(Keys.ENTER);
            driver.findElement(By.cssSelector("#menu-item-1127 > .menu-link > .text-wrap")).click();
            driver.navigate().back();
            driver.navigate().back();
            driver.findElement(By.linkText("WOMEN")).click();
            driver.findElement(By.linkText("Dresses")).click();
            driver.findElement(By.linkText("SHOP")).click();
            //driver.findElement(By.linkText("Simple Product")).click();
           driver.get("http://localhost/wordpress/produkt/flowy-blouse/");
            driver.findElement(By.linkText("My Account")).click();
            driver.findElement(By.id("username")).sendKeys("agnieszka.jazwinskaa@wp.pl");
            driver.findElement(By.id("password")).sendKeys("12345678");
            driver.findElement(By.xpath("//button[@value='Zaloguj się']")).click();
            Assertions.assertTrue(driver.getPageSource().contains(" Błąd: Dla adresu e-mail"));
           // Assert.assertTrue(driver.getPageSource().contains(" Błąd: Dla adresu e-mail agnieszka.jazwinskaa@wp.pl podano nieprawidłowe hasło."));



        }
    }

