package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class YoutubeSearchPage {


        WebDriver driver;

        public YoutubeSearchPage() {

            driver = Driver.getDriver();
            PageFactory.initElements(driver, this);

        }

        @FindBy(xpath = "//input[@name='search_query']")
        public WebElement youtubeSearchBox;


        @FindBy(id="search-icon-legacy")
        public WebElement youtubeSearchButton;

        @FindBy(xpath = "//span[class='bold style-scope yt-formatted-string']")
        public WebElement youtubeSearchResults;


    }
