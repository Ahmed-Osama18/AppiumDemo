package pages;

import com.shaft.driver.SHAFT;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActivityPage {
    By custom_title = AppiumBy.accessibilityId("Custom Title");
    WebDriver driver;

    public ActivityPage(WebDriver driver) {
        this.driver = driver;
    }

    public CustomTitle_Page clickOnCustomTitle(){
        driver.findElement(custom_title).click();
        return new CustomTitle_Page(driver);
    }


}
