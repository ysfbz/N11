package login;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseTest {
    static WebDriver driver;


    @Before
    public void setUp() throws Exception{

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.n11.com");
        Thread.sleep(1000);

    }

    @After
    public void quit(){
        driver.quit();
    };


    public static WebElement findElement (By by){
        return driver.findElement(by);
    }


    public static void clickElement(By by){
        findElement(by).click();
    }

    public static void sendElement(By by, String text){
        findElement(by).sendKeys(text);
    }






}
