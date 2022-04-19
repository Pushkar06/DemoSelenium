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
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\p.mahesh.gujarathi\\IdeaProjects\\DemoSelenium1\\DemoSelenium\\src\\test\\resources\\driver\\chromedriver.exe");
        driver=new ChromeDriver();
    }
    @Given("Can we able to loading or not")
    public void can_we_able_to_loading_or_not() throws InterruptedException {
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }
    @When("Search for name {string} and {string} on the web page")
    public void searchForNameAndOnTheWebPage(String arg0, String arg1) throws InterruptedException {
    driver.findElement(By.name("q")).sendKeys(arg0, arg1);
    Thread.sleep(2500);
    }
    @And("load page by given name")
    public void load_page_by_given_name() throws InterruptedException {
    driver.findElement(By.name("btnK")).submit();
    Thread.sleep(3200);
    }
    @Then("open LinkedIn Profile by Name")
    public void openLinkedInProfileByName() {

    }

    @Then("Close the page")
    public void closeThePage() {
        driver.navigate().back();
        try {
            Thread.sleep(2200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.close();
        driver.quit();

    }


}
