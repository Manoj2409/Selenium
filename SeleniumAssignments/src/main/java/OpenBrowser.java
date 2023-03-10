import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

interface OpenBrowserData{
    static String url="https://www.redbus.in/";
}

public class OpenBrowser extends Functions implements OpenBrowserData{
    static WebDriver driver;
    public static void OpenBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        implicitlyWait(20);
        String a = driver.getTitle();
        System.out.println(a);
    }
}
