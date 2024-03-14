package findfElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementById {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file://C:\\Repository\\Selenium_Course\\src\\test\\resources\\index.html");
        String elementText = driver.findElement(By.id("welcome")).getText();
        String elementDescText = driver.findElement(By.name("description")).getText();
        String elementlistText = driver.findElement(By.className("list2")).getText();
        System.out.println(elementlistText);
        driver.quit();
    }
}
