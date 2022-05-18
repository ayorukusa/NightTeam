package study.practice.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyGoogle {
    public static void main(String[] args) throws InterruptedException {


        //set

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        //open google https://www.google.com/

        driver.get("https://www.google.com/");
        Thread.sleep(3000);

        //Write "flower" in search box and hit enter
        WebElement searchAndHit = driver.findElement(By.name("q"));
        Thread.sleep(3000);
        searchAndHit.sendKeys("flower" + Keys.ENTER);


       driver.quit();

    }
}
