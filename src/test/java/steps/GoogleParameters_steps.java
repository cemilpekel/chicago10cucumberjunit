package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.Driver;

public class GoogleParameters_steps {

    GooglePage gglParaObj = new GooglePage();


    @Given("User is on the homepage of google")
    public void user_is_on_the_homepage_of_google() {

        Driver.getDriver().get("https://google.com");

    }

    @When("User enters {string}")
    public void user_enters(String string) {
        gglParaObj.searchBox.sendKeys(string+Keys.ENTER);


    }

    @Then("User should see {string} in the title")
    public void user_should_see_in_the_title(String string) {

        String expectedTitle = string + " - Google Search";

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals("Does not match",
                expectedTitle,actualTitle);

    }

}
