package pages;

import helpers.BaseSeleniumPage;
import helpers.ConfProperties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignPage extends BaseSeleniumPage {

    public SignPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "email_create")
    WebElement emailField;
    @FindBy(id = "SubmitCreate")
    WebElement submitButton;
    @FindBy(xpath = "//*[@id='uniform-id_gender1']")
    WebElement genderField;
    @FindBy(name = "customer_firstname")
    WebElement nameField;
    @FindBy(id = "customer_lastname")
    WebElement lastnameField;
    @FindBy(name = "passwd")
    WebElement passwordField;
    @FindBy(xpath = "//*[@id='days']//*[@value='2']")
    WebElement dayField;
    @FindBy(xpath = "//*[@id='months']//*[@value='5']")
    WebElement mouthField;
    @FindBy(xpath = "//*[@id='years']//*[@value='2000']")
    WebElement yearField;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[3]/div/div/form/div[1]/h3")
    WebElement headingPersonal;


    public SignPage cliclnext() {
        clickElement(submitButton);
        return this;
    }

    public SignPage inputLogin() {
        sendElement(emailField,ConfProperties.getProperty("Email-address"));
        return this;
    }


    public void personalInformation() {
        clickElement(genderField);
        sendElement(nameField,ConfProperties.getProperty("Name"));
        sendElement(lastnameField,ConfProperties.getProperty("LastName"));
        sendElement(passwordField,ConfProperties.getProperty("Password"));
        clickElement(dayField);
        clickElement(mouthField);
        clickElement(yearField);
    }


    public String getTextPersonal() {
        return headingPersonal.getText();
    }
}
