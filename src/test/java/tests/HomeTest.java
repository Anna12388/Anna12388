package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {
    @Test
    public void checkHomePageIsOpen(){
        homePage.open();
        Assert.assertTrue(homePage.isPageOpen());
    }
    }
