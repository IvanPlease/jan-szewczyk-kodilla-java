package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_FIRSTNAME = "//input[contains(@name, \"firstname\")]";
    public static final String XPATH_LASTNAME= "//input[contains(@name, \"lastname\")]";
    public static final String XPATH_PHONE_MAIL = "//input[contains(@name, \"reg_email__\")]";
    public static final String XPATH_PASSWORD = "//input[contains(@name, \"reg_passwd__\")]";
    public static final String XPATH_SELECT = "//select[%d]";
    public static final String XPATH_RADIO = "//input[contains(@name, \"sex\")][contains(@value, %d)]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME_INCOGNITO);
        driver.get("https://www.facebook.com/");

        WebElement firstnameField = driver.findElement(By.xpath(XPATH_FIRSTNAME));
        firstnameField.sendKeys("John");

        WebElement lastnameField = driver.findElement(By.xpath(XPATH_LASTNAME));
        lastnameField.sendKeys("Doe");

        WebElement phoneOrMailField = driver.findElement(By.xpath(XPATH_PHONE_MAIL));
        phoneOrMailField.sendKeys("john.doe@test.com");

        WebElement passwordField = driver.findElement(By.xpath(XPATH_PASSWORD));
        passwordField.sendKeys("JohnDoeAtTestDotCom");

        WebElement daySelectField = driver.findElement(By.xpath(String.format(XPATH_SELECT, 1)));
        Select daySelect = new Select(daySelectField);
        daySelect.selectByValue("16");

        WebElement monthSelectField = driver.findElement(By.xpath(String.format(XPATH_SELECT, 2)));
        Select monthSelect = new Select(monthSelectField);
        monthSelect.selectByValue("11");

        WebElement yearSelectField = driver.findElement(By.xpath(String.format(XPATH_SELECT, 3)));
        Select yearSelect = new Select(yearSelectField);
        yearSelect.selectByValue("1999");

        WebElement sexRadioField = driver.findElement(By.xpath(String.format(XPATH_RADIO, 2)));
        sexRadioField.click();
    }
}
