package helpers;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


abstract public class BaseSeleniumPage {
    protected static WebDriver driver;
    public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }


    public void clickElement(WebElement webElement){
        webElement.click();
    }

    public void clickButtonJS(WebElement webElement1,WebElement webElement2){
        webElement1.click();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", webElement2);
    }
    public void sendElement(WebElement webElement, String element){
        webElement.sendKeys((CharSequence) element);

    }



}
