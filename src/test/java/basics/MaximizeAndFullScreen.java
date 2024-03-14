package basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeAndFullScreen {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
       // driver.manage().window().maximize();
        driver.get("https://jihedlassoued1.github.io/Selenium-html/home.html");
        driver.manage().window().fullscreen();



    }
}
