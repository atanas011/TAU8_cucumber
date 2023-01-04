package steps;

import base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import static org.junit.Assert.assertTrue;

public class Steps extends BaseUtil {

    private WebDriver driver;
    private final BaseUtil baseutil;

    public Steps(BaseUtil util) {
        this.baseutil = util;
    }

    @Before
    public void setUp() {
        driver = new EdgeDriver();
    }

    @Given("User is on the Login page of the ParaBank app")
    public void user_is_on_the_login_page_of_the_para_bank_app() {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @When("User enters valid {string} and {string} with {string}")
    public void user_enters_valid_credentials(String username, String password, String fullName) {
        baseutil.fullName = fullName;
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("username")).submit();
    }

    @Then("Overview page should be displayed")
    public void user_should_be_taken_to_the_overview_page() throws InterruptedException {
        Thread.sleep(3000);
        String fullName = driver.findElement(By.className("smallText")).getText();
        System.out.println(baseutil.fullName);
        assertTrue(fullName, fullName.contains(baseutil.fullName));
        driver.findElement(By.linkText("Log Out")).click();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
