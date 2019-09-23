package se.soprasteria;

import org.testng.Assert;
import org.testng.annotations.Test;
import se.soprasteria.automatedtesting.webdriver.helpers.driver.AutomationDriver;
import soprasteria.android.AndroidBasetest;

public class PerformAndroidTest extends AndroidBasetest {

    @Test(timeOut = 18000, dataProvider = "getDriver")
    public void  performAtest(AutomationDriver driver){
        Assert.assertTrue(mainPage.isPageLoaded(), "Login page did not work");
        mainPage.clickForTop();


    }



}
