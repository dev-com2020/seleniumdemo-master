package pl.alx.testy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class SelIntroduction {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "seleniumdemo-master/src/test/java/pl/alx/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        System.setProperty("webdriver.gecko.driver", "seleniumdemo-master/src/test/java/pl/alx/driver/geckodriver.exe");
        WebDriver driver1 = new FirefoxDriver();

        System.setProperty("webdriver.edge.driver", "seleniumdemo-master/src/test/java/pl/alx/driver/msedgedriver.exe");
        WebDriver driver2 = new EdgeDriver();

        driver.get("https://rahulshettyacademy.com");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.close();
        driver2.close();
        driver1.close();

driver.quit();

    }
}
