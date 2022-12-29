package pages;

import Actions.MobileActions;
import com.shaft.driver.SHAFT;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerticesPage {
    WebDriver driver;
    By picture = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.View");
    public VerticesPage(WebDriver driver) {
        this.driver = driver;

    }
    public VerticesPage swipeRight() {
        MobileActions.swipeRightOnElement(picture, driver);
        return this;
    }

    public VerticesPage swipeLeft()
    {
        MobileActions.swipeLeftOnElement(picture);
        return this;
    }
}
