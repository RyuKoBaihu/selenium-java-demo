package Utils;
import BrowserFactory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static BrowserFactory.DriverFactory.getDriver;
import static Utils.SendKeys.wait;

public class ClickElements {

    public static void clickByID(String id){
        DriverFactory.getWebDriverWait().until(ExpectedConditions.elementToBeClickable((By.id(id))));
        WebElement element = getDriver().findElement(By.id(id));
        element.click();
    }

    public static void clickByXpath(String xpath){
        DriverFactory.getWebDriverWait().until(ExpectedConditions.elementToBeClickable((By.xpath(xpath))));
        WebElement element = getDriver().findElement(By.xpath(xpath));
        element.click();
    }



}
