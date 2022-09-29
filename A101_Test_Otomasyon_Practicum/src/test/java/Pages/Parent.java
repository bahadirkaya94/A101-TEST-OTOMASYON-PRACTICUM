package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class Parent implements IParent{
    @Override
    public void sendKeysFunction(WebElement element, String value)
    {
        waitUntilVisible(element);
        element.clear();
        element.sendKeys(value);
    }
    @Override
    public void waitUntilVisible(WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    @Override
    public void clickFunction(WebElement element)
    {
        waitUntilClickable(element);
        moveToElement(element);
        element.click();
    }
    @Override
    public void waitUntilClickable(WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    @Override
    public void moveToElement(WebElement element)
    {
        Actions actions = new Actions(Driver.getDriver());
        Action action = actions.moveToElement(element).build();
        action.perform();
    }
    @Override
    public void SelectByValue(WebElement element, String text)
    {
        Select select = new Select(element);
        //moveToElement(element);
        select.selectByValue(text);
    }
    @Override
    public void waitAttribute(WebElement element, String attribute, String text)
    {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.attributeToBe(element, attribute, text));
    }
    @Override
    public void waitTextToBe(WebElement element, String text)
    {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBePresentInElement(element,text));
    }
}