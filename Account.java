package googleStart;

import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.*;




public class Account extends precond {


    @Test
    public void startAcc() {
        driver.get("https://eatstreet.com/signin");
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("testiks@testt.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.id("signin")).click();
        driver.findElement(By.id("edit-info")).click();
        driver.findElement(By.id("firstName")).clear();
        driver.findElement(By.id("firstName")).sendKeys("Tess");
        driver.findElement(By.id("lastName")).click();
        driver.findElement(By.id("lastName")).clear();
        driver.findElement(By.id("lastName")).sendKeys("Tesss");
        driver.findElement(By.id("emailAddress")).click();
        driver.findElement(By.id("emailAddress")).clear();
        driver.findElement(By.id("emailAddress")).sendKeys("testiks@testt.comsss");
        driver.findElement(By.id("confirm-modal-btn")).click();
        //
      /*  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Testik");
    driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Test");
    driver.findElement(By.xpath("//input[@id='phoneNumber']")).sendKeys("2132232323");
    driver.findElement(By.xpath("//input[@id='confirm-modal-btn']")).click();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    driver.findElement(By.xpath("//a[@id='change-password']")).click();
    driver.findElement(By.xpath("//input[@id='currentPassword']")).sendKeys("123456");
    driver.findElement(By.xpath("//input[@id='newPassword']")).sendKeys("1234567");
    driver.findElement(By.xpath("//input[@id='newPasswordConfirm']")).sendKeys("1234567");
    driver.findElement(By.xpath("//input[@id='confirm-modal-btn']")).click();


    }*/
    }

}
