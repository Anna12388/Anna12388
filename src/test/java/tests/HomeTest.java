package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {
    @Test
        public void testHomePageIsOpen() {
            driver.get("https://bulynia3.lightning.force.com/lightning/page/home");

            Assert.assertTrue(homePage.isPageOpen(), "Home page is not open.");
        }

}
