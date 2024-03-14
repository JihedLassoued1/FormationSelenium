package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedFrames {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jihedlassoued1.github.io/Selenium-html/frames.html");
        driver.switchTo().frame("menu");
        driver.switchTo().frame("links");
        System.out.println(driver.findElement(By.className("locators")).getText());
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        System.out.println(driver.findElement(By.xpath("(//div[@class='frame-container']/div/p)[2]")).getText());
    }
}
