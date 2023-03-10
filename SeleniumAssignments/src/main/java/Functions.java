import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Functions {





    public static void explicitWait(By element, int seconds) {
        WebDriverWait wait = new WebDriverWait(OpenBrowser.driver, Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public static void implicitlyWait(int seconds) {
        OpenBrowser.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }
    public static void sleep(int milliSeconds) throws InterruptedException {
        Thread.sleep(milliSeconds);
    }
    public static void screenShot(String ScreenshotName) throws IOException {
        try {
            File takeScreenShot = ((TakesScreenshot) OpenBrowser.driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(takeScreenShot, new File(".//screenshot/" + ScreenshotName + ".jpg"));
        } catch (WebDriverException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }













}
