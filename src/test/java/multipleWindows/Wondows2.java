package multipleWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.Set;

public class Wondows2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jihedlassoued1.github.io/Selenium-html/windows.html");
        driver.manage().window().maximize();
        String parent = driver.getWindowHandle();
        //System.out.println(parent);
        driver.findElement(By.partialLinkText("Website")).click();

        Set<String> allWindows = driver.getWindowHandles();
        //System.out.println(allWindows);
        for(String window :allWindows){
            if(!window.equalsIgnoreCase(parent)){
                System.out.println(driver.getTitle());
                driver.switchTo().window(window);
                System.out.println(driver.getTitle());
                //driver.close();
            }
        }

        driver.quit();

    }
}
