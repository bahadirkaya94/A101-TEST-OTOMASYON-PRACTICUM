package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Address extends Parent {
    public Address()
    {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//input[@placeholder='Ev adresim, iş adresim vb.']")
    private WebElement addressTitle;
    @FindBy(css = "input[name*=first_name]")
    private WebElement firstName;
    @FindBy(css = "input[name*=last_name]")
    private WebElement lastName;
    @FindBy(css = "input[name=phone_number]")
    private WebElement phoneNumber;
    @FindBy(xpath = "//select[@name='city']")
    private WebElement city;
    @FindBy(xpath = "//select[@name='township']")
    private WebElement town;
    @FindBy(xpath = "//select[@name='district']")
    private WebElement district;
    @FindBy(className = "js-address-textarea")
    private WebElement fullAddress;
    @FindBy(className = "js-address-form-submit-button")
    private WebElement saveAddress;
    WebElement myElement;
    public void findAndSend(String strElement, String value)
    {
        switch (strElement)
        {
            case "addressTitle": myElement = addressTitle; break;
            case "firstName": myElement = firstName; break;
            case "lastName": myElement = lastName; break;
            case "phoneNumber": myElement = phoneNumber; break;
            case "fullAddress": myElement = fullAddress; break;
        }
        sendKeysFunction(myElement, value);
    }
    public void findAndClick(String strElement)
    {
        switch (strElement)
        {
            case "city": myElement = city; break;
            case "town": myElement = town; break;
            case "district": myElement = district; break;
            case "saveAddress": myElement = saveAddress; break;
        }
        clickFunction(myElement);
    }

    public void findAndSelectByValue(String strElement, String text)
    {
        switch (strElement)
        {
            case "city": myElement = city; break;
            case "town": myElement = town; break;
            case "district": myElement = district; break;
        }
        SelectByValue(myElement, text);
    }
}

