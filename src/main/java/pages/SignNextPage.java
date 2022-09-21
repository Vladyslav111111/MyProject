package pages;

import helpers.BaseSeleniumPage;
import helpers.ConfProperties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignNextPage extends BaseSeleniumPage {

    public SignNextPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[@class='page-heading']")
    WebElement headingAddress;
    @FindBy(name = "company")
    WebElement companyField;
    @FindBy(id = "address1")
    WebElement companyAddressField;
    @FindBy(name = "city")
    WebElement cityField;
    @FindBy(xpath = "//*[@name='id_state']//*[@value='1']")
    WebElement stateField;
    @FindBy(id = "postcode")
    WebElement postField;
    @FindBy(id = "phone_mobile")
    WebElement phoneField;
    @FindBy(name = "alias")
    WebElement addressField;
    @FindBy(name = "submitAccount")
    WebElement clickField;


    public void signNextPage() {
        sendElement(companyField, ConfProperties.getProperty("Company"));
        sendElement(companyAddressField, ConfProperties.getProperty("Company-address"));
        sendElement(cityField,ConfProperties.getProperty("City"));
        clickElement(stateField);
        sendElement(postField, ConfProperties.getProperty("Post"));
        sendElement(phoneField, ConfProperties.getProperty("Phone"));
        sendElement(addressField, ConfProperties.getProperty("Address"));
        clickElement(clickField);


    }

    public String getTextAddress() {
        return headingAddress.getText();
    }
}


