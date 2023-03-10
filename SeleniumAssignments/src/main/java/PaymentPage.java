import org.openqa.selenium.By;

import java.io.IOException;
interface PaymentPageData{
    By proceedBtn=By.xpath("//input[@value='Proceed to pay']");
}

public class PaymentPage extends PersonalDetails implements PaymentPageData{
    public static void PaymentPage() throws IOException, InterruptedException {
        driver.findElement(proceedBtn).click();
        sleep(6000);
        screenShot("paymentDetails");
        driver.quit();
    }
}
