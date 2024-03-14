package multipleWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wondows {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jihedlassoued1.github.io/Selenium-html/windows.html");
        driver.manage().window().maximize();
        System.out.println(driver.getWindowHandle());
        driver.findElement(By.partialLinkText("Website")).click();
        System.out.println(driver.getWindowHandles());
        driver.quit();

    }
}
