import org.junit.Assert;
import org.junit.Test;
import pages.SignPage;
import test.MainPageTest;

public class SignPageTest {

    @Test
    public void signTest() {

        MainPageTest mainPageTest = new MainPageTest();
        mainPageTest.setUp();
        mainPageTest.mainTest();

        SignPage signPage = new SignPage();
        signPage.inputLogin()
                .cliclnext()
                .personalInformation();

        String title = signPage.getTextPersonal();
        Assert.assertEquals("YOUR PERSONAL INFORMATION", title);
    }

}

