package StepDefinitions;

import Pages.Address;
import Pages.CartProcess;
import Pages.CategoryNav;
import Runners.Runners;
import Utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Steps {
    Address address=new Address();
    CartProcess cartProcess = new CartProcess();
    CategoryNav categoryNav = new CategoryNav();
    @Given("web sitesine gidilir")
    public void webSitesineGidilir()
    {
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get("https://www.a101.com.tr/");
    }
    @And("acilan cerezler kapatilir")
    public void acilanCerezlerKapatilir(DataTable elements)
    {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
        {
            cartProcess.findAndClick(listElement.get(i));
        }
    }
    @And("giyim & aksesuar kategorisine gidilir")
    public void giyimAndAksesuarKategorisineGidilir(DataTable elements)
    {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
        {
            categoryNav.findAndMoveToElement(listElement.get(i));
        }
    }
    @And("dizalti corap alt kategorisine tiklanir")
    public void dizaltiCorapAltKategorisineTiklanir(DataTable elements)
    {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
        {
            categoryNav.findAndClick(listElement.get(i));
        }
    }
    @And("siyah olan ilk urune tiklanir")
    public void siyahOlanIlkUruneTiklanir(DataTable elements)
    {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
        {
            cartProcess.findAndClick(listElement.get(i));
        }
    }
    @And("Urunun renginin siyah oldugu dogrulanir")
    public void urununRengininSiyahOlduguDogrulanir(DataTable elements)
    {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++)
        {
            cartProcess.findAndControlisDisplayed(listElement.get(i).get(0), listElement.get(i).get(1));
        }
    }
    @And("acilan sayfada sepete ekle butonuna tiklanir")
    public void acilanSayfadaSepeteEkleButonunaTiklanir(DataTable elements)
    {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
        {
            cartProcess.findAndClick(listElement.get(i));
        }
    }

    @And("acilan sayfada sepeti goruntule butonuna tiklanir")
    public void acilanSayfadaSepetiGoruntuleButonunaTiklanir(DataTable elements)
    {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
        {
            cartProcess.findAndClick(listElement.get(i));
        }
    }

    @And("acilan sayfada sepeti onayla butonuna tiklanir")
    public void acilanSayfadaSepetiOnaylaButonunaTiklanir(DataTable elements)
    {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
        {
            cartProcess.findAndClick(listElement.get(i));
        }
    }

    @And("acilan sayfada uye olmadan devam et butonuna tiklanir")
    public void acilanSayfadaUyeOlmadanDevamEtButonunaTiklanir(DataTable elements)
    {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
        {
            cartProcess.findAndClick(listElement.get(i));
        }
    }

    @And("acilan sayfada e-mail adresi girilir")
    public void acilanSayfadaEMailAdresiGirilir(DataTable elements)
    {

        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++)
        {
            cartProcess.findAndSendRandomEMail(listElement.get(i).get(0), listElement.get(i).get(1));
        }

    }
    @And("devam et butonuna tiklanir")
    public void devamEtButonunaTiklanir(DataTable elements)
    {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
        {
            cartProcess.findAndClick(listElement.get(i));
        }
    }

    @And("acilan sayfada yeni adres olustur butonuna tiklanir")
    public void acilanSayfadaYeniAdresOlusturButonunaTiklanir(DataTable elements)
    {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
        {
            cartProcess.findAndClick(listElement.get(i));
        }
    }
    @And("acilan formda adres basligi, ad, soyad, cep telefonu, adres bilgileri girilir")
    public void acilanFormdaAdresBasligiAdSoyadCepTelefonuAdresBilgileriGirilir(DataTable elements)
    {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++)
        {
            address.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
        }
    }

    @And("ile tiklanir")
    public void ileTiklanir(DataTable elements)
    {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
        {
            address.findAndClick(listElement.get(i));
        }
    }

    @And("il secilir")
    public void ilSecilir(DataTable elements)
    {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++)
        {
            address.findAndSelectByValue(listElement.get(i).get(0),listElement.get(i).get(1));
        }
    }

    @And("ilceye tiklanir")
    public void ilceyeTiklanir(DataTable elements)
    {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
        {
            address.findAndClick(listElement.get(i));
        }
    }

    @And("ilce secilir")
    public void ilceSecilir(DataTable elements)
    {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++)
        {
            address.findAndSelectByValue(listElement.get(i).get(0),listElement.get(i).get(1));
        }
    }
    @And("mahalleye tiklanir")
    public void mahalleyeTiklanir(DataTable elements)
    {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
        {
            address.findAndClick(listElement.get(i));
        }
    }

    @And("mahalle secilir")
    public void mahalleSecilir(DataTable elements)
    {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++)
        {
            address.findAndSelectByValue(listElement.get(i).get(0),listElement.get(i).get(1));
        }
    }
    @And("acilan formda kaydet butonuna tiklanir")
    public void acilanFormdaKaydetButonunaTiklanir(DataTable elements)
    {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
        {
            address.findAndClick(listElement.get(i));
        }
    }
    @And("acilan sayfada kargo firmasi secilir")
    public void acilanSayfadaKargoFirmasiSecilir(DataTable elements)
    {
        cartProcess.findAndWaitUntilClickable("saveAndContinue");
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
        {
            cartProcess.findAndClick(listElement.get(i));
        }
    }
    @And("kaydet ve devam et butonuna tiklanir")
    public void kaydetVeDevamEtButonunaTiklanir(DataTable elements)
    {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
        {
            cartProcess.findAndClick(listElement.get(i));
        }
    }
    @And("acilan sayfada garanti pay butonuna tiklanir")
    public void acilanSayfadaGarantiPayButonunaTiklanir(DataTable elements)
    {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
        {
            cartProcess.findAndClick(listElement.get(i));
        }
    }
    @And("acilan sayfada sozlesme onay butonuna tiklanir")
    public void acilanSayfadaSozlesmeOnayButonunaTiklanir(DataTable elements)
    {
        cartProcess.findAndConfirmAttribute("garantiPay","class","payment-tab payment-tab-gpay js-payment-tab active");
        List<String> listElement = elements.asList(String.class);
            for (int i = 0; i < listElement.size(); i++)
            {
                cartProcess.findAndClick(listElement.get(i));
            }
    }
    @And("garanti pay ile ode butonuna tiklanir")
    public void garantiPayIleOdeButonunaTiklanir(DataTable elements)
    {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
        {
            cartProcess.findAndClick(listElement.get(i));
        }
    }

    @And("odeme sayfasinin geldigi dogrulanir")
    public void odemeSayfasininGeldigiDogrulanir()
    {
        String url="https://sanalposprov.garanti.com.tr/servlet/gt3dengine";
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.urlToBe(url));
        Assert.assertEquals(url,Driver.getDriver().getCurrentUrl());
    }
}
