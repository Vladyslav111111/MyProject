import helpers.ConfProperties;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignPage;

public class SignPageTest{

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

