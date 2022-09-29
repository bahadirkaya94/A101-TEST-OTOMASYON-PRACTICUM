package Pages;

import org.openqa.selenium.WebElement;

public interface IParent {

    void sendKeysFunction(WebElement element, String value);

    void waitUntilVisible(WebElement element);

    void clickFunction(WebElement element);

    void waitUntilClickable(WebElement element);

    void moveToElement(WebElement element);

    void SelectByValue(WebElement element, String text);

    void waitAttribute(WebElement element, String attribute, String text);

    void waitTextToBe(WebElement element, String text);


}
