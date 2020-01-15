import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class FirstTest {
    protected  WebDriver driver;

    @BeforeClass
    public static void setupBr(){
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();

    }

    @Test
    public void chrome() {
        driver =new ChromeDriver();
      driver.get("https://otus.ru/");
    }

    @Test
    public void fireFox(){
        driver = new FirefoxDriver();
        driver.get("https://otus.ru/");
    }
}
