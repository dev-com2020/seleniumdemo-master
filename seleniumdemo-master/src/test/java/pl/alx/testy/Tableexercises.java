package pl.alx.testy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tableexercises {
    public static void main(String[] args) throws InterruptedException {
        int sum = 0;
        System.setProperty("webdriver.chrome.driver", "seleniumdemo-master/src/test/java/pl/alx/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
        Thread.sleep(2000);
        driver.findElement(By.className("fc-button-label")).click();
        Thread.sleep(2000);
        WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
        int rowcount = table.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size();
        int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();

        for(int i=0; i<count-2;i++){
            String value = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i)
                    .getText();
            int valueInteger = Integer.parseInt(value);
            sum = sum+valueInteger;

        }
        System.out.println(sum);
    }
}
