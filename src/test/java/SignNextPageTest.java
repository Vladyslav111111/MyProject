import helpers.BaseSeleniumPage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pages.SignNextPage;


public class SignNextPageTest  {

    @Test
    public void signNextTest() {
        SignPageTest signPageTest = new SignPageTest();
        signPageTest.signTest();
        SignNextPage signNextPage = new SignNextPage();

        String title = signNextPage.getTextAddress();
        Assert.assertEquals("CREATE AN ACCOUNT"
                , title);
        signNextPage.signNextPage();
    }
}

