package pages;

import Actions.MobileActions;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewsPage {
    WebDriver driver;

    By radio_locator = AppiumBy.accessibilityId("Radio Group");
    public ViewsPage(WebDriver driver) {
        this.driver = driver;
        new MobileActions(driver);
    }

    public RadioGroupPage clickOnRadioGroup()
    {
        MobileActions.scrollDownToSpecificText("Radio Group");
        driver.findElement(radio_locator).click();
        return new RadioGroupPage(driver);
    }

}
