package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class CategoryNav extends Parent{
    public CategoryNav()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath ="(//a[@title='GİYİM & AKSESUAR'])[1]")
    private WebElement giyimAndAksesuar;
    @FindBy(xpath = "//a[@title='Dizaltı Çorap']")
    private WebElement dizaltiCorap;
    WebElement myElement;
    public void findAndClick(String strElement)
    {
        switch (strElement)
        {
            case "dizaltiCorap" : myElement=dizaltiCorap; break;
        }
        clickFunction(myElement);
    }
    public void findAndMoveToElement(String strElement)
    {
        switch (strElement)
        {
            case "giyimAndAksesuar": myElement = giyimAndAksesuar; break;
        }
        moveToElement(myElement);
    }
}