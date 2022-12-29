package pages;

import com.shaft.driver.SHAFT;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.ActivityPage;

public class App_Page {
    By activity_locator = AppiumBy.accessibilityId("Activity");
    WebDriver driver;

    public App_Page(WebDriver driver) {
        this.driver = driver;
    }

    public ActivityPage clickOnActivity()
    {
        driver.findElement(activity_locator).click();
        return new ActivityPage(driver);
    }
}
