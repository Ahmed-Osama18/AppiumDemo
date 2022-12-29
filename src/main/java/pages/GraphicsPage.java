package pages;

import Actions.MobileActions;
import com.shaft.driver.SHAFT;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.App;
import org.testng.Assert;
import pages.VerticesPage;

public class GraphicsPage {
    WebDriver driver;
    By ScrollToFit_locator = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView");
    By scaletofit_BTN = AppiumBy.accessibilityId("ScaleToFit");

    By Vertices_BTN = AppiumBy.accessibilityId("Vertices");
    public GraphicsPage(WebDriver driver) {
        this.driver = driver;
        new MobileActions(driver);
    }

    public void clickOnScaleToFit()
    {
        MobileActions.scrollDownToSpecificText("ScaleToFit");
        driver.findElement(scaletofit_BTN).click();
        Assert.assertEquals(driver.findElement(ScrollToFit_locator).getText(),"Graphics/ScaleToFit");
    }

    public VerticesPage clickOnVertices()
    {
        MobileActions.scrollDownToSpecificText("Vertices");
        driver.findElement(Vertices_BTN).click();
        return new VerticesPage(driver);
    }


}
