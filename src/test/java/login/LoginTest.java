package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class LoginTest {
    private WebDriver driver;

    public void setUp() throws InterruptedException {
        System.setProperty ("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver ();

        driver.get ("https://www.facebook.com/");

        Thread.sleep (5000);

        driver.manage ().window ().maximize ();

        System.out.println (driver.getTitle ());

        Thread.sleep (7000);

        driver.findElement (By.xpath ("//*[@id=\"email\"]")).sendKeys ("davorigaga");
        driver.findElement (By.xpath ("//*[@id=\"pass\"]")).sendKeys ("PASSWORD");

        driver.findElement (By.xpath ("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
    }

    public static void main(String args[]) throws InterruptedException {
        LoginTest test = new LoginTest ();
        test.setUp ();
    }
}
