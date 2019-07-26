package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.AmazonSearchPage;
import utilities.Driver;

public class AmazonSearch_steps {

    AmazonSearchPage amazonObj = new AmazonSearchPage();



    @Given("user is on the amazon homepage")
    public void user_is_on_the_amazon_homepage() {
        Driver.getDriver().get("https://www.amazon.com/");

    }

    @When("user enters headphones keyword")
    public void user_enters_headphones_keyword() {
        amazonObj.searchBox.sendKeys("headphones");


}

    @When("user clicks to amazon search button")
    public void user_clicks_to_amazon_search_button() {
        amazonObj.searchButton.click();

    }

    @Then("user should see homepage in results")
    public void user_should_see_homepage_in_results() {

        String actualText = amazonObj.amazonSearchResult.getText();

        Assert.assertTrue("Headphone was not located in title",
                actualText.contains("headphones"));


    }

}
