package interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.lang.model.element.Element;

public class exampleInteractions {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("file://C:\\Repository\\Selenium_Course\\src\\test\\resources\\index.html");
        boolean etat = driver.findElement(By.id("welcome")).isDisplayed();
        System.out.println(etat);
        boolean etatChackboxBanana = driver.findElement(By.id("Banana")).isSelected();
        System.out.println(etatChackboxBanana);
       // WebElement Select = driver.findElement(By.id("courses"));
        Select dropDown = new Select(driver.findElement(By.id("courses")));
        dropDown.selectByIndex(1);

    }
}
