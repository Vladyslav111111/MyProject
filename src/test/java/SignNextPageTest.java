import org.junit.Test;
import org.junit.Assert;

import pages.SignNextPage;


public class SignNextPageTest {

   // @Test
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

