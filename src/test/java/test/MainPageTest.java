package test;

import helpers.BaseSeleniumPage;
import helpers.ConfProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainPage;
import java.util.concurrent.TimeUnit;


public class MainPageTest {
    public static WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("url"));
        BaseSeleniumPage.setDriver(driver);
    }

    @Test
    public void mainTest() {
        MainPage mainPage = new MainPage()
                .createOrderDress()
                .authentication()
                .procced();
        String title = mainPage.getText();
        Assert.assertEquals("AUTHENTICATION", title);

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}


