package googleStart;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.concurrent.TimeUnit;

public class GooSearch {


    protected  static WebDriver driver;

    @Before
    public void SetupTest () {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
       // System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
        driver = new ChromeDriver();
        //driver =new FirefoxDriver();
        driver.manage().window().maximize();

    }

    @Test

    public void SearchTest(){
        //Запускаю сайт
        //driver.get("https://

        driver.get("https://eatstreet.com/create-account");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testiks@testt.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@id='passwordAgain']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[@id='signup']")).click();
        if(driver.getTitle().contains("Create an Account")) {
            System.out.println("Test result:Account is created");
        }
        else {
            System.out.println("Bad" + driver.getTitle());
        }







        //Ожидайте 3 сек.




       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.findElement(By.name("q")).clear();
        //driver.findElement(By.name("q")).sendKeys("EatStreet");
        //driver.findElement(By.name("btnK")).click();
       // driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

        //
        //driver.findElement(By.cssSelector("a[href='https://eatstreet.com/']")).click();
        //System.out.println(driver.getTitle());

        //if (driver.getTitle().contains("EatStreet"))
       // {
           // System.out.println("Good");}

       // else {
         //   System.out.println("Bad" + driver.getTitle());
       // }
        driver.quit();



    }





}
