import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestFirst {
        @Test
        public void demoTest(){
            System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
            WebDriver driver= new ChromeDriver();
            driver.manage().window().setSize(new Dimension(1295, 730));
            driver.navigate().to("http://google.pl");

           WebElement searchField=driver.findElement(By.cssSelector("[title='Szukaj']"));
            String searchEntry = "wszechświaty równoległe";
           String title="Dupa - Zobacz co znaleźliśmy na Allegro.pl";
           searchField.submit();
            driver.findElement(By.xpath(".//'[text()-'"+title+"']")).click();
        }
    }


