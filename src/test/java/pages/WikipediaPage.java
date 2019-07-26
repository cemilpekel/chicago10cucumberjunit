package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WikipediaPage {

    WebDriver driver;

    public WikipediaPage() {

        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath="//input[@name='search']")
    public WebElement wikiSearchBox;

    @FindBy(id="firstHeading")
    public WebElement firstHeader;

//    @FindBy(xpath="//input[@class='sprite svg-search-icon']")
//    public WebElement searchBttn;

}
