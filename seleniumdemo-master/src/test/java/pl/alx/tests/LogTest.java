package pl.alx.tests;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pl.alx.pages.HomePage;
import pl.alx.pages.LoggedUserPage;
import pl.alx.pages.MyAccountPage;

public class LogTest extends BaseTest {

    @Given("User is on Home Page")
    public void user_is_on_home_page() {
        new HomePage(driver);
    }

    @When("User Navigate to LogIn Page")
    public void user_navigate_to_login_page() {
        new HomePage(driver).openMyAccountPage();
    }

    @When("User enters UserName {string} and Password {string}")
    public void user_enters_user_name_and_password(String userName, String password) {
        new MyAccountPage(driver).logInValidData(userName, password);
    }

    @Then("User should see {string} on the page")
    public void user_should_see_on_the_page(String expectedText) {
        WebElement dashboardLink = new LoggedUserPage(driver).getDashboardLink();
        Assert.assertEquals(dashboardLink.getText(), expectedText);
    }
}