package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.DatatablesPage;
import utilities.Driver;

public class DataTables_steps {

    DatatablesPage dtObj = new DatatablesPage();

    @Given("User is on the data tables homepage")
    public void user_is_on_the_data_tables_homepage() {
        Driver.getDriver().get("https://editor.datatables.net/");
    }

    @Given("User clicks to New Button")
    public void user_clicks_to_New_Button() {
        dtObj.newButton.click();
    }

    @Then("User should see Create New Entry Box")
    public void user_should_see_Create_New_Entry_Box() {
        Assert.assertTrue(dtObj.newButton.isDisplayed());

    }

    @Then("User should enter first name")
    public void user_should_enter_first_name() {
        dtObj.firstName.sendKeys("Cemil");
    }

    @Then("User should enter last name")
    public void user_should_enter_last_name() {
     dtObj.lastName.sendKeys("Pekel");
    }

    @Then("User should enter position")
    public void user_should_enter_position() {
       dtObj.position.sendKeys("SDET");
    }

    @Then("User should enter office")
    public void user_should_enter_office() {
        dtObj.office.sendKeys("Chicago");
    }

    @Then("User should enter extension")
    public void user_should_enter_extension() {
       dtObj.extension.sendKeys("5401");
    }

    @Then("User should enter start date")
    public void user_should_enter_start_date() {
       dtObj.startDate.sendKeys("2019-07-19");
    }

    @Then("User should enter salary")
    public void user_should_enter_salary() {
        dtObj.salary.sendKeys("100000");
    }

    @Then("User should click to Create button")
    public void user_should_click_to_Create_button() {
       dtObj.creteBtn.click();
    }

    @Then("User enters first name to search box")
    public void user_enters_first_name_to_search_box() {
     dtObj.searchBox.sendKeys("Cemil");
    }

    @Then("User should see first name is inserted in the table")
    public void user_should_see_first_name_is_inserted_in_the_table() throws InterruptedException {
     String actualName = dtObj.nameVerify.getText();
     Thread.sleep(5000);
     Assert.assertTrue("Name was not found",
             actualName.contains("Cemil"));


    }

    @Then("User should enter first name {string}")
    public void user_should_enter_first_name(String firstName)
    {
       dtObj.firstName.sendKeys(firstName);
    }

    @Then("User should enter last name  {string}")
    public void user_should_enter_last_name(String lastName) {
       dtObj.lastName.sendKeys(lastName);
    }

    @Then("User should enter position   {string}")
    public void user_should_enter_position(String position) {
        dtObj.position.sendKeys(position);
    }

    @Then("User enters first name {string} to search box")
    public void user_enters_first_name_to_search_box(String firstName) {

        dtObj.searchBox.sendKeys(firstName);

    }

    @Then("User should see first name {string} is inserted in the table")
    public void user_should_see_first_name_is_inserted_in_the_table(String firstName) throws InterruptedException {

        String actualName = dtObj.nameVerify.getText();
        Thread.sleep(5000);
        Assert.assertTrue("Name was not found",
                actualName.contains(firstName));

    }

    @Then("User should enter office {string}")
    public void user_should_enter_office(String office) {
        dtObj.office.sendKeys(office);
    }

    @Then("User should enter extension {string}")
    public void user_should_enter_extension(String extension) {
        dtObj.extension.sendKeys(extension);


    }

    @Then("User should enter start date {string}")
    public void user_should_enter_start_date(String startDate) {
        dtObj.startDate.sendKeys(startDate);

    }

    @Then("User should enter salary  {string}")
    public void user_should_enter_salary(String salary) {
        dtObj.salary.sendKeys(salary);

    }

}
