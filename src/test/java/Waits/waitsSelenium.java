package Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class waitsSelenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jihedlassoued1.github.io/Selenium-html/wait.html");
        //Thread.sleep(10000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement((By.className("primary"))).click();
    }
}
