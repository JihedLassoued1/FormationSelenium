package interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsInteractions {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("file://C:\\Repository\\Selenium_Course\\src\\test\\resources\\index.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        Actions action = new Actions(driver);
        WebElement ButtonAction = driver.findElement(By.xpath("//input[@value='Click me']"));
        //action.doubleClick(ButtonAction).perform();
        action.contextClick(ButtonAction).perform();


    }
}
