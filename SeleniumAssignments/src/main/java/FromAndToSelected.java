import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
 interface FromAndToSelectedData{
     By fromLocationPath=By.xpath("//li[contains(text(),'"+"Chennai"+"')]");
     By fromPath=By.id("src");
     By toPath=By.id("dest");
     By toLocationPath=By.xpath("//li[contains(text(),'"+"Madurai"+"')]");
     By dataFieldPath=By.id("onward_cal");
     By datePath=By.xpath("//div[@id='rb-calendar_onward_cal']/table[@class='rb-monthTable first last']/tbody/tr[6]/td[1]");
     By searchBtn=By.id("search_btn");
}

public class FromAndToSelected extends OpenBrowser implements FromAndToSelectedData{
    public static void FromAndToSelected() {
        //From location
        WebElement from = driver.findElement(fromPath);
        if (from.isDisplayed()) {
            System.out.println("From is enabled");
        }
        from.sendKeys("Chennai");
        implicitlyWait(2);
        WebElement fromLocation = driver.findElement(fromLocationPath);
        fromLocation.click();

        //to location
        WebElement to = driver.findElement(toPath);
        if (to.isDisplayed())
            System.out.println("From is enabled");
        to.sendKeys("Madurai");
        implicitlyWait(2);
        WebElement toLocation = driver.findElement(toLocationPath);
        toLocation.click();

        //Date selection from calendar
        WebElement dateField = driver.findElement(dataFieldPath);
        dateField.click();
        WebElement date = driver.findElement(datePath);
        date.click();
        implicitlyWait(2);

        // Search button
        WebElement searchButton = driver.findElement(searchBtn);
        searchButton.click();
    }
}
