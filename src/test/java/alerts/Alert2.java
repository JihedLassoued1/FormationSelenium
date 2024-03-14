package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jihedlassoued1.github.io/Selenium-html/alert.html");
        driver.findElement(By.className("prompt")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Bonjour");
        driver.switchTo().alert().accept();
    }
}
