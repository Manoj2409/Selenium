import java.io.IOException;
interface VerifyFromAndToData{

}

public class VerifyFromAndTo extends FromAndToSelected implements VerifyFromAndToData{
    public static void VerifyFromAndTo() throws IOException, InterruptedException {
        sleep(5000);
        String title = driver.getTitle();
        System.out.println(title);
        if (title.contains("Chennai to Madurai Bus Tickets Booking")) {
            System.out.println("Title is verified");
        } else {
            System.out.println("Wrong Title");
        }
        screenShot("FromAndTo");
    }
}
