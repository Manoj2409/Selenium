import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

interface ViewSeatsData{
    static By popUp=By.xpath("//i[@class='icon icon-close']");
    static By viewSeatBtn=By.xpath("//*[@id='23902073']/div/div[2]/div[1]");
}
public class ViewSeats extends VerifyFromAndTo implements ViewSeatsData{
    public static void ViewSeats() throws IOException, InterruptedException {

        //Handling Popup
        sleep(5000);
        driver.findElement(popUp).click();

        //Selecting view seats
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement viewSeats = wait.until(ExpectedConditions.visibilityOfElementLocated(viewSeatBtn));
        screenShot("ViewSeat");
        viewSeats.click();
        implicitlyWait(5);

    }
}
