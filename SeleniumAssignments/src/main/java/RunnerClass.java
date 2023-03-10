import java.io.IOException;

public class RunnerClass extends PaymentPage{
    public static void main(String[] args) throws InterruptedException, IOException {

        OpenBrowser();
        FromAndToSelected();
        VerifyFromAndTo();
        ViewSeats();
        SelectSeats();
        SelectLocations();
        PersonalDetails();
        PaymentPage();

    }

}
