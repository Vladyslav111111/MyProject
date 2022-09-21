import helpers.BaseSeleniumPage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.VerificationPage;

public class VerificationPageTest extends BaseSeleniumPage {
    @Test
    public void mainTestVer() {
        SignNextPageTest signNextPageTest = new SignNextPageTest();
        signNextPageTest.signNextTest();
        VerificationPage verificationPage = new VerificationPage();

        verificationPage.confirmation();

        String title = verificationPage.titleField();
        Assert.assertEquals("PLEASE CHOOSE YOUR PAYMENT METHOD"
                , title);}
    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}

