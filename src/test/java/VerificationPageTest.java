import helpers.BaseSeleniumPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import pages.VerificationPage;

public class VerificationPageTest extends BaseSeleniumPage {
    @Test
    public void mainTestVer() {
        SignNextPageTest signNextPageTest = new SignNextPageTest();
        signNextPageTest.signNextTest();
        VerificationPage verificationPage = new VerificationPage();

        verificationPage.confirmation();

        String title = verificationPage.titleField();
        Assert.assertEquals("PLEASE CHOOSE YOUR PAYMENT METHOD", title);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}

