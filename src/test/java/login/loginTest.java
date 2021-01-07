package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginTest {


    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
    setUp();
    driver.get("https://www.n11.com");
    Thread.sleep(1000);
    clickElement(By.className("closeBtn"));
    clickElement(By.className("btnSignIn"));
    sendElement(By.id("email"),"email@mail.com");
    sendElement(By.id("password"),"sifre1234");
    clickElement(By.id("loginButton"));
    Thread.sleep(500);
    driver.quit();
    }


    public static WebElement findElement (By by){

        return driver.findElement(by);
    }


    public static void clickElement(By by){
        findElement(by).click();
    }

    public static void sendElement(By by, String text){
        findElement(by).sendKeys(text);
    }





    public static void setUp(){

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();

    }
}
