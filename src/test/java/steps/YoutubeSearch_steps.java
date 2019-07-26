package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonSearchPage;
import pages.YoutubeSearchPage;
import utilities.Driver;

public class YoutubeSearch_steps {

   YoutubeSearchPage ytObj = new YoutubeSearchPage();


    @Given("User is on the youtube search homepage")
    public void user_is_on_the_youtube_search_homepage() {
        Driver.getDriver().get("https://www.youtube.com/");
    }

    @Given("User is able to see the search box")
    public void user_is_able_to_see_the_search_box() {
       Assert.assertTrue( ytObj.youtubeSearchBox.isDisplayed());

    }

    @Given("User is able to see the search button")
    public void user_is_able_to_see_the_search_button() {

       Assert.assertTrue( ytObj.youtubeSearchButton.isDisplayed());

    }

    @When("User searches for funny cat videos")
    public void user_searches_for_funny_cat_videos() throws InterruptedException {

        Thread.sleep(2000);
        ytObj.youtubeSearchBox.sendKeys("funny cat videos"+ Keys.ENTER);
        Thread.sleep(2000);

    }

    @Then("User should see results related to funny cat videos")
    public void user_should_see_results_related_to_funny_cat_videos() {

        String actual = Driver.getDriver().getTitle();
        System.out.println(actual);

        String expected = "cat";

        Assert.assertTrue("Does not contain ",
                actual.contains(expected));


    }

    @When("User searches for funny dog videos")
    public void user_searches_for_funny_dog_videos() throws InterruptedException {
        Thread.sleep(2000);
        ytObj.youtubeSearchBox.sendKeys("funny dog videos"+Keys.ENTER);
        Thread.sleep(2000);


    }

    @Then("User should see results related to funny dog videos")
    public void user_should_see_results_related_to_funny_dog_videos() {

        String actual = Driver.getDriver().getTitle();
        System.out.println(actual);
        String expected = "dog";

        Assert.assertTrue("Does not contain",
                actual.contains(expected));

    }

    @When("User searches for funny pet videos")
    public void user_searches_for_funny_pet_videos() throws InterruptedException {
        Thread.sleep(2000);
        ytObj.youtubeSearchBox.sendKeys("funny pet videos"+Keys.ENTER);
        Thread.sleep(2000);

    }

    @Then("User should see results related to funny pet videos")
    public void user_should_see_results_related_to_funny_pet_videos() {
        String actual = Driver.getDriver().getTitle();
        String expected = "pet";
        Assert.assertTrue("Does not contain",
                actual.contains(expected));



    }

}
