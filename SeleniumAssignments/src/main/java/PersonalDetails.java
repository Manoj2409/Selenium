import org.openqa.selenium.By;

import java.io.IOException;
interface PersonalDetailsData{
    By Name=By.xpath("//*[@name='Name_0']");
    By genderBtn=By.xpath("//*[@class='gender_position_abs ']");
    By Age=By.xpath("//*[@placeholder='Age']");
    By Email=By.xpath("//*[@placeholder='Email ID']");
    By Phone=By.xpath("//*[@placeholder='Phone']");
    By noInsuranceOpt=By.xpath("//*[@id='insuranceNotOpted']");
    String name="Manoj";
    String age="22";
    String email="manojt2409@gmail.com";
    String phone="9790914976";
    By namePath=By.xpath("//input[@name='Name_0']");
}

public class PersonalDetails extends SelectLocations implements PersonalDetailsData {
    public static void PersonalDetails() throws IOException {
        explicitWait(namePath, 7);
        driver.findElement(Name).sendKeys(name);
        driver.findElement(genderBtn).click();
        driver.findElement(Age).sendKeys(age);
        driver.findElement(Email).sendKeys(email);
        driver.findElement(Phone).sendKeys(phone);
        screenShot("PersonalDetails");
        driver.findElement(noInsuranceOpt).click();


    }
}
