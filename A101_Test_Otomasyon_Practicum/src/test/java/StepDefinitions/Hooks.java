package StepDefinitions;

import Utilities.Driver;
import com.aventstack.extentreports.service.ExtentTestManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Hooks
{
    @Before
    public void before()
    {
        System.out.println("The Scenario Started");
    }

    @After
    public void after(Scenario scenario)
    {
        System.out.println("The Scenario is Finished");
        System.out.println("Scenario Result = "+ scenario.getStatus());
        System.out.println("Is Scenario Failed ? = "+ scenario.isFailed());

        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy");

        if (scenario.isFailed())
        {
            TakesScreenshot screenshot = (TakesScreenshot) Driver.getDriver();
            File screenFile = screenshot.getScreenshotAs(OutputType.FILE);

            //ExtentTestManager.getTest().addScreenCaptureFromBase64String(getBase64Screenshot());

            try
            {
                FileUtils.copyFile(screenFile,
                        new File("target/FailedScreenShots/"+ scenario.getId()+date.format(formatter)+".png"));
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        Driver.quitDriver();
    }
    public String getBase64Screenshot()
    {
        return ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BASE64);
    }
}