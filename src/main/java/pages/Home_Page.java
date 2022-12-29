package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home_Page {
    WebDriver driver;
    By accessibility_locator = AppiumBy.accessibilityId("Access'ibility");
    By app_locator = AppiumBy.accessibilityId("App");
    By graphics_locator = AppiumBy.accessibilityId("Graphics");
    By views_locator = AppiumBy.accessibilityId("Views");


    public Home_Page(WebDriver driver) {
        this.driver = driver;
    }

    public Accessibility_Page clickOnAccessibility()
    {
        driver.findElement(accessibility_locator).click();
        return new Accessibility_Page(driver);
    }

    public App_Page clickOnApp()
    {
        driver.findElement(app_locator).click();
        return new App_Page(driver);
    }

    public GraphicsPage clickOnGraphics()
    {
        driver.findElement(graphics_locator).click();
        return new GraphicsPage(driver);
    }

    public ViewsPage clickOnViews()
    {
        driver.findElement(views_locator).click();
        return new ViewsPage(driver);
    }


}
