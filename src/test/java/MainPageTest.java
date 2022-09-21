import helpers.BaseSeleniumPage;
import helpers.ConfProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.MainPage;

import java.time.Duration;


public class MainPageTest {
    public static WebDriver driver;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout((Duration.ofSeconds(20)));
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

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}


