package Runners;

import com.aventstack.extentreports.service.ExtentService;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

@CucumberOptions
        (
                tags = "@SmokeTest",
                features = {"src/test/java/FeatureFiles/"},
                glue = {"StepDefinitions"},
                plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"},
                monochrome = true,
                dryRun = false
        )
@Listeners({ExtentITestListenerClassAdapter.class})
public class Runners extends AbstractTestNGCucumberTests

{
    @BeforeClass(alwaysRun = true)

    @AfterClass
    public static void writeExtentReport() {

        ExtentService.getInstance().setSystemInfo("User Name", "Bahadır Kaya");
        ExtentService.getInstance().setSystemInfo("Application Name", "A101_Test_Otomasyon_Practicum");
        ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name").toString());
        ExtentService.getInstance().setSystemInfo("Department", "QA");
        ExtentService.getInstance().setSystemInfo("Ek Satır", "A101'in web sitesine gidip,kadın dizaltı çorap " +
                                                     "alt kategorisinden siyah renkli bir ürün sepete eklenip ve e-mail " +
                                                     "adresiyle devam edilip gerekli adres bilgilerini girdikten sonra ödeme " +
                                                     "sayfasına gidildiği test edildi");
    }
}
