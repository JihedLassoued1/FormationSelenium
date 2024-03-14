package interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdowns {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jihedlassoued1.github.io/Selenium-html/home.html");
        driver.manage().window().maximize();
        Select coursesDropDown = new Select(driver.findElement(By.id("courses")));
        coursesDropDown.selectByIndex(1);
    }
}
