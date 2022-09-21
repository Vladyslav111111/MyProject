package pages;

import helpers.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MainPage extends BaseSeleniumPage {

    public MainPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[@class='blockbestsellers']")
    WebElement sectionField;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div[1]/ul[2]/li[1]/div/div[2]/div[2]/a[1]/span")
    WebElement addToCartOrder;
    @FindBy(xpath = "//*[@class='btn btn-default button button-medium']")
    WebElement authenticationField;
    @FindBy(xpath = "//*[@class='button btn btn-default standard-checkout button-medium']")
    WebElement proceedField;
    @FindBy(xpath = "//*[@class='page-heading']")
    WebElement heading;


    public MainPage createOrderDress() {
        clickButtonJS(sectionField, addToCartOrder);
        return this;
    }

    public MainPage authentication() {
        clickElement(authenticationField);
        return this;
    }

    public String getText() {
        return heading.getText();
    }

    public MainPage procced() {
        clickElement(proceedField);
        return this;
    }
}


