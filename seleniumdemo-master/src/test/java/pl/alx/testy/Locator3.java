package pl.alx.testy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Locator3 {

    public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", "seleniumdemo-master/src/test/java/pl/alx/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElement(By.xpath("//header/div/button[2]/parent::div/button[1]")).getText());
        System.out.println(driver.findElement(By.xpath("//header/div/button[2]/parent::div/button[2]")).getText());
        System.out.println(driver.findElement(By.xpath("//header/div/button[2]/following-sibling::button[1]")).getText());

        driver.navigate().to("https://rahulshettyacademy.com");
        driver.navigate().back();
        driver.navigate().forward();
    }
}