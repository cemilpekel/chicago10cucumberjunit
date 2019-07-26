package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.jmx.support.WebSphereMBeanServerFactoryBean;
import utilities.Driver;

public class GasMileageCalculatorPage {

    WebDriver driver;

    public GasMileageCalculatorPage() {

        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);

    }

    @FindBy(id="uscodreading")
    public WebElement currentOdometerReadingInput;


    @FindBy(id= "uspodreading")
    public WebElement previousOdometerReadingInput;

    @FindBy(id="usgasputin")
    public WebElement gasInput;

    @FindBy(id="usgasprice")
    public WebElement gasPrice;

    @FindBy(xpath="//input[@alt='Calculate']")
    public WebElement calculateButton;

    @FindBy(xpath = "//b[contains(text(), 'mpg')]")
    public WebElement resultInGallon;



}