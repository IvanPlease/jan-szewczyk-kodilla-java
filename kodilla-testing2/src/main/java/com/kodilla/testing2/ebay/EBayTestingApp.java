package com.kodilla.testing2.ebay;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EBayTestingApp {
    public static final String SEARCH_PHRASE = "Laptop";
    public static final String SEARCH_FIELD = "Laptop";
    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.ebay.com/");
        WebElement searchBar = driver.findElement(By.className("gh-tb"));
        searchBar.sendKeys(SEARCH_PHRASE);
        searchBar.submit();
    }
}
