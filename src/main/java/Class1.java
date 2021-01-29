import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.jar.JarOutputStream;


public class Class1 {

    public static void main(String args[])
    {
        WebDriver driver;
        System.out.println("Hello");
        System.setProperty("webdriver.chrome.driver","C:\\Tools_Download\\Drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://www.google.com/");
        driver.findElement(By.id("input") ).sendKeys("pintrest.com");
        driver.quit();


    }

}
