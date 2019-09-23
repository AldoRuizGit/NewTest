package soprasteria.android.android.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import se.soprasteria.automatedtesting.webdriver.api.base.BasePageObject;
import se.soprasteria.automatedtesting.webdriver.helpers.driver.AutomationDriver;

public class MainPage extends BasePageObject {

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"YouTube\"]")
    protected WebElement HomeElement;
    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Trending\"]/android.widget.ImageView")
    protected WebElement clickTrend;


    public MainPage(AutomationDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageLoaded() {
        return elementHelper.isElementDisplayedWithinTime(HomeElement, 10000);
    }

    public void clickForTop() {
        elementHelper.clickWithinTime(clickTrend, 200000);

    }
}
