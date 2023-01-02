package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Steps {

    private WebDriver driver;

    @Given("User is on the Login page")
    @Given("User is on the Login page of the ParaBank app")
    public void user_is_on_the_login_page_of_the_para_bank_app() {
        driver = new EdgeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @When("User enters valid credentials")
    public void user_enters_valid_credentials() {
        driver.findElement(By.name("username")).sendKeys("Ana");
        driver.findElement(By.name("password")).sendKeys("123");
        driver.findElement(By.name("username")).submit();
    }

    @Then("Overview page should be displayed")
    public void user_should_be_taken_to_the_overview_page() {
        driver.findElement(By.linkText("Log Out")).click();
        driver.quit();
    }
}
