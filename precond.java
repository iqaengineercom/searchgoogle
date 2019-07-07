package googleStart;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class precond {

    public static WebDriver driver;

    @Before
    public void SetupTests() {
        // ChromeOptions options = new ChromeOptions();

        // options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        // System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
        driver = new ChromeDriver();
        //driver =new FirefoxDriver();

        driver.manage().window().maximize();


    }
}
