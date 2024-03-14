package Frames;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Frames {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jihedlassoued1.github.io/Selenium-html/frames.html");

        driver.switchTo().frame("groupado");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

        driver.findElement(By.name("firstName")).sendKeys("jihed");

    }
}
