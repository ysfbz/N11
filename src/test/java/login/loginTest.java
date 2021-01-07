package login;

import org.junit.Test;
import org.openqa.selenium.By;

public class loginTest extends baseTest{

    @Test
    public void loginForm() throws Exception{



        clickElement(By.className("closeBtn"));
        clickElement(By.className("btnSignIn"));
        sendElement(By.id("email"),"email@mail.com");
        sendElement(By.id("password"),"sifre1234");
        clickElement(By.id("loginButton"));
        Thread.sleep(500);


    }
}

