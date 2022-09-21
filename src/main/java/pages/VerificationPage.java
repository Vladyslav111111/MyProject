package pages;

import helpers.BaseSeleniumPage;
import helpers.ConfProperties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class VerificationPage extends BaseSeleniumPage {
    public VerificationPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class='form-control']")
    WebElement wishesField;
    @FindBy(name = "processAddress")
    WebElement continueButton;
    @FindBy(id = "cgv")
    WebElement agreeButton;
    @FindBy(name = "processCarrier")
    WebElement processButton;
    @FindBy(xpath = "//*[@class='page-heading']")
    WebElement titleField;


    public void confirmation() {
        sendElement(wishesField, ConfProperties.getProperty("Wish"));
        clickElement(continueButton);
        clickElement(agreeButton);
        clickElement(processButton);
    }

    public String titleField() {
        return titleField.getText();
    }

}
