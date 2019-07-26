package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonSearchPage {

    WebDriver driver;

    public AmazonSearchPage() {

        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);

    }

    @FindBy(id="twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(xpath = "//span[@class='a-color-state a-text-bold']")
    public WebElement amazonSearchResult;

    @FindBy(xpath = "//input[@value='Go']")
    public WebElement searchButton;


}
