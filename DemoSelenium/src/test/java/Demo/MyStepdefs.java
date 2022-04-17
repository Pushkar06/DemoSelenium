package Demo;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyStepdefs {
    public static WebDriver driver;
    static {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pushk\\IdeaProjects\\DemoSelenium\\src\\test\\resources\\driver\\chromedriver.exe");
        driver=new ChromeDriver();
    }
    @Given("Can we able to loading or not")
    public void can_we_able_to_loading_or_not() {
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
    }
    @When("Search for name {string} and {string} on the web page")
    public void searchForNameAndOnTheWebPage(String arg0, String arg1) {
    driver.findElement(By.name("q")).sendKeys(arg0, arg1);
    }
    @And("load page by given name")
    public void load_page_by_given_name() {
    driver.findElement(By.name("btnK")).submit();
    driver.findElement(By.linkText("https://in.linkedin.com")).submit();
    }


    @Then("Close the page")
    public void closeThePage() {

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
