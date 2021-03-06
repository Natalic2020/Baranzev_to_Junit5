package ru.stqa.training.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Options {private WebDriver driver;
    private WebDriverWait wait;

    @BeforeEach
    public void start(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-fullscreen");
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void myFirstTest(){
        //   driver.get("https://www.germanpersonnel.de/");
    }

    @AfterEach
    public void stop(){
        driver.quit();
        driver = null;
    }
}