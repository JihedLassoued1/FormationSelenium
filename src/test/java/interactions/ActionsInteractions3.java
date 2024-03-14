package interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsInteractions3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("file://C:\\Repository\\Selenium_Course\\src\\test\\resources\\index.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        Actions action = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable-1"));
        WebElement destination = driver.findElement(By.className("example-dropzone"));
       // action.dragAndDrop(source, destination).perform();
        action.clickAndHold(source).moveToElement(destination).release().perform();



    }
}
