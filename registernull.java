package googleStart;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class registernull {

    public static WebDriver driver;

    @Before
            public void Start() {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        // System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
        driver = new ChromeDriver();
        //driver =new FirefoxDriver();

        driver.manage().window().maximize();
    }

    @Test

    public void validnull(){
        driver.get("https://eatstreet.com/create-account");

        WebElement singup = driver.findElement(By.xpath("//button[@id='signup']"));
        if(singup.isDisplayed())
        singup.click();
        else
            System.out.println("Кнопки");


        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        WebElement email = driver.findElement(By.id("email-validation-tag"));
        if(email.isDisplayed())
            System.out.println("Поле емейл обязательное");
        else
            System.out.println("Ошибка: Поле емейл необязательно");

        WebElement password = driver.findElement(By.xpath("//div[@id='password-validation-tag']"));
        if(password.isDisplayed())
            System.out.println("Поле пароль обязательное");
        else
            System.out.println("Ошибка: Поле пароль необязательно");
        WebElement passwordagain = driver.findElement(By.xpath("//div[@id='passwordAgain-validation-tag']"));
        if(passwordagain.isDisplayed())
            System.out.println("Поле повторный пароль обязательное");
        else
            System.out.println("Ошибка: Поле повторный пароль необязательно");




    }

}
