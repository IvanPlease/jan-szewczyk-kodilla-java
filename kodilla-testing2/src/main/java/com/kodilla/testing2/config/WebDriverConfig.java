package com.kodilla.testing2.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverConfig {
    public final static String FIREFOX = "FIREFOX_DRIVER";
    public final static String CHROME = "CHROME_DRIVER";
    public final static String CHROME_INCOGNITO = "CHROME_DRIVER_INCOGNITO";
    public static WebDriver getDriver(final String driver){
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium-drivers\\Firefox\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chrome\\chromedriver.exe");
        if(driver.equals(FIREFOX)){
            return new FirefoxDriver();
        }else if(driver.equals(CHROME)) {
            return new ChromeDriver();
        }else if(driver.equals(CHROME_INCOGNITO)){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            return new ChromeDriver(options);
        }else{
            return null;
        }
    }
}
