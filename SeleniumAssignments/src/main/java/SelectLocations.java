import org.openqa.selenium.By;

import java.io.IOException;

interface SelectLocationsData{
    static By Cmbt=By.xpath("//span[text()='Koyambedu']");
    static By Madurai=By.xpath("//span[text()='Karungalakudi(Madurai) Near Near Bus Stop']");
    static By selectedBtn=By.xpath("//button[@class='button continue inactive']");

}

public class SelectLocations extends SelectSeats implements SelectLocationsData{
    public static void SelectLocations() throws IOException {


        implicitlyWait(2);
        driver.findElement(Cmbt).click();
        implicitlyWait(2);
        driver.findElement(Madurai).click();
        implicitlyWait(5);
        screenShot("selectedLocation");
        driver.findElement(selectedBtn).click();
    }
}
