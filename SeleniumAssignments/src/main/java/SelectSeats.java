import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

interface SelectSeatsData{
    By canvasPath=By.xpath("//*[@id='rt_23902073']/div/div/div/div[3]/div[3]/div[2]/canvas");

}

public class SelectSeats extends ViewSeats implements SelectSeatsData{
    public static void SelectSeats() throws InterruptedException, IOException {

        //selecting the seat
        sleep(4000);

        //explicitWait(lowerDeck, 20);
        WebElement canvas = driver.findElement(canvasPath);
        Actions actions = new Actions(driver);
        int flag = 0;
        for (int i = 30; i < 75 && flag != 1; i = i + 2) {
            for (int j = 30; j < 75 && flag != 1; j = j + 2) {
                actions.moveToElement(canvas, i, j).click().build().perform();
                if (!(canvas.getAttribute("class").equals(""))) {
                    flag = 1;
                }
            }
        }
        screenShot("selectedSeat");
    }

}
