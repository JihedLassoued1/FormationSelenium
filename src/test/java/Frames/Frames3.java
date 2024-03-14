package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Frames3 {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jihedlassoued1.github.io/Selenium-html/frames.html");
        WebElement groupadoFrame = driver.findElement(By.id("groupado"));
        driver.switchTo().frame(groupadoFrame);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

        driver.findElement(By.name("firstName")).sendKeys("jihed");
        driver.switchTo().parentFrame();
        System.out.println(driver.findElement(By.xpath("(//div[@class='frame-container']/div/p)[1]")).getText());

    }
}
