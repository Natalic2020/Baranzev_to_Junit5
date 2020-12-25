package ru.stqa.training.selenium.lesson2;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.stqa.training.selenium.TestBaseFireFoxNightly;
import ru.stqa.training.selenium.TestBaseIEImplicitly;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginLitecart extends TestBaseIEImplicitly {



    @BeforeEach
    public void setUp() throws Exception {

    }

    @Test
    public void loginAdminTest(){
        driver.get("http://localhost/litecart/admin/");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
        String expected = "My Store";
        String actuil = driver.getTitle();

        assertEquals(expected, actuil);
    }
}
