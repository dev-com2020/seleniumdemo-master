package pl.alx.testy;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShoppingCartSteps {
    WebDriver driver;
    WebDriverWait w;

    @Given("I am on the shopping page")
    public void i_am_on_the_shopping_page() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/pl/alx/driver/chromedriver.exe");
        driver = new ChromeDriver();
        w = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
    }

    @When("I add {string}, {string}, and {string} to the cart")
    public void i_add_something_something_and_something_to_the_cart(String strArg1, String strArg2, String strArg3) throws InterruptedException {
        String[] itemsNeeded = {strArg1, strArg2, strArg3};
        Base.addItems(driver, itemsNeeded);
    }

    @When("I proceed to checkout")
    public void i_proceed_to_checkout() {
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[contains(text(), 'PROCEED TO CHECKOUT')]")).click();
    }

    @When("I enter the promo code {string}")
    public void i_enter_the_promo_code_something(String strArg1) {
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys(strArg1);
        driver.findElement(By.cssSelector("button.promoBtn")).click();
    }

    @Then("I should see the promo code applied successfully")
    public void i_should_see_the_promo_code_applied_successfully() {
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
        Assert.assertEquals("Code applied ..!", driver.findElement(By.cssSelector("span.promoInfo")).getText());
    }
}