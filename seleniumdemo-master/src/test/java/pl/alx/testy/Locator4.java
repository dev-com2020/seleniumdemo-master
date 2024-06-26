package pl.alx.testy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class Locator4 {

    public static void main(String[] args) throws InterruptedException, IOException {

        String name = "rahul";
        System.setProperty("webdriver.chrome.driver", "seleniumdemo-master/src/test/java/pl/alx/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String password = getPassword(driver);

        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        driver.findElement(By.id("inputUsername")).sendKeys(name);

        driver.findElement(By.name("inputPassword")).sendKeys(password);

        driver.findElement(By.className("signInBtn")).click();

        Thread.sleep(2000);

        System.out.println(driver.findElement(By.tagName("p")).getText());

        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");

        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");

        driver.findElement(By.xpath("//*[text()='Log Out']")).click();


}

    public static String getPassword(WebDriver driver) throws InterruptedException {

        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        driver.findElement(By.linkText("Forgot your password?")).click();

        Thread.sleep(1000);

        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

        String passwordText =driver.findElement(By.cssSelector("form p")).getText();

        String[] passwordArray = passwordText.split("'");

        String password = passwordArray[1].split("'")[0];

        return password;


    }
    }
