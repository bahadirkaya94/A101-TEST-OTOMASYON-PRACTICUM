package Pages;

import Utilities.Driver;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartProcess extends Parent{
    public CartProcess()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    private WebElement acceptCookies;
    @FindBy(xpath = "(//h3[contains(text(),'Siyah')])[1]")
    private WebElement product;
    @FindBy(xpath = "//div[contains(text(),'Seçılen Renk:')]//span[contains(text(),'SİYAH')]")
    private WebElement productColour;
    @FindBy(xpath = "//button[@class='add-to-basket button green block with-icon js-add-basket']")
    private WebElement addToCart;
    @FindBy(linkText = "Sepeti Görüntüle")
    private WebElement viewCart;
    @FindBy(linkText = "Sepeti Onayla")
    private WebElement confirmCart;
    @FindBy(partialLinkText ="ÜYE OLMADAN DEVAM ET")
    private WebElement continueWithoutAMember;
    @FindBy(xpath = "//input[@name='user_email']")
    private WebElement eMail;
    @FindBy(xpath ="//button[contains(text(),'DEVAM ET')]")
    private WebElement continueButton;
    @FindBy(partialLinkText = "Yeni adres oluştur")
    private WebElement createNewAddress;
    @FindBy(xpath = "(//div[@class='radio'])[3]")
    private WebElement cargo;
    @FindBy(xpath = "//button[@class='button block green js-proceed-button']")
    private WebElement saveAndContinue;
    @FindBy(xpath = "(//div[contains(text(),'Garanti Pay')])[1]")
    private WebElement garantiPay;
    @FindBy(xpath = "(//input[@class='checkout__contract__checkbox js-checkout-agreement'])[1]")
    private WebElement contractConfirmation;
    @FindBy(xpath = "//a[@class='button green js-gpay-payment']")
    private WebElement payWithGarantiPay;
    WebElement myElement;

    public void findAndClick(String strElement) {
        switch (strElement) {
            case "acceptCookies": myElement = acceptCookies;break;
            case "product": myElement = product;break;
            case "addToCart": myElement = addToCart;break;
            case "viewCart": myElement = viewCart;break;
            case "confirmCart": myElement = confirmCart;break;
            case "continueWithoutAMember": myElement = continueWithoutAMember;break;
            case "continueButton": myElement = continueButton;break;
            case "createNewAddress": myElement = createNewAddress;break;
            case "cargo": myElement = cargo;break;
            case "saveAndContinue": myElement = saveAndContinue; break;
            case "garantiPay": myElement = garantiPay;break;
            case "contractConfirmation": myElement = contractConfirmation;break;
            case "payWithGarantiPay": myElement = payWithGarantiPay;break;
        }
            clickFunction(myElement);
    }
    public void findAndConfirmAttribute(String strElement,String attribute,String text)
    {
        switch (strElement)
        {
            case "garantiPay" : myElement=garantiPay; break;
        }
        waitAttribute(myElement,attribute,text);
    }
    public void findAndControlisDisplayed(String strElemenet,String text){
        switch (strElemenet)
        {
            case "productColour" : myElement=productColour; break;
        }
        waitTextToBe(myElement,text);
    }
    public void findAndWaitUntilClickable(String strElement)
    {
        switch (strElement)
        {
            case "saveAndContinue": myElement = saveAndContinue; break;
        }
        waitUntilClickable(myElement);
    }
    public void findAndSendRandomEMail(String strElement, String mailExtension)
    {
        String randomAlphabe= RandomStringUtils.randomAlphabetic(8);
        String mailAndExtension = randomAlphabe + mailExtension;

        switch (strElement)
        {
            case "eMail" : myElement =eMail; break;
        }
        sendKeysFunction(myElement, mailAndExtension);
    }
}
