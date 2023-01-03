package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Steps {

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new EdgeDriver();
    }

    @Given("User is on the Login page of the ParaBank app")
    public void user_is_on_the_login_page_of_the_para_bank_app() {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @When("User enters valid {string} and {string}")
    public void user_enters_valid_credentials(String username, String password) {
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("username")).submit();
    }

    @Then("Overview page should be displayed")
    public void user_should_be_taken_to_the_overview_page() {
        driver.findElement(By.linkText("Log Out")).click();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
