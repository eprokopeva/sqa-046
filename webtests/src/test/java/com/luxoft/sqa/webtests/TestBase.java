package com.luxoft.sqa.webtests;

import com.luxoft.sqa.model.ContactParameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver driver;

    @BeforeMethod
    public void setup () {
        System.setProperty("webdriver.chrome.driver", "lib/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://localhost:8080/addressbook/");

    }

    public void login (String login, String password) {
        driver.findElement(By.name("user")).clear();
        driver.findElement(By.name("user")).sendKeys(login);
        driver.findElement(By.name("pass")).clear();
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement (By.cssSelector ("input[type='submit']")).click();

    }

    public void fillContact(ContactParameters CP) {
        driver.findElement(By.name("firstname")).sendKeys(CP.getFirstname());
        driver.findElement(By.name("lastname")).sendKeys(CP.getLastname());
        driver.findElement(By.name("address")).sendKeys(CP.getAddress());
        driver.findElement(By.name("email")).sendKeys(CP.getEmail());


    }

    public void submitContactCreation () {
        driver.findElement(By.name("submit")).click();
    }

    public void pressAddNewBotton () {
        driver.findElement(By.linkText("add new")).click();
    }

    @AfterMethod
    public void ternDown (){
        driver.close();
    }

    public void selectCheckBox () {
        driver.findElement(By.name("selected[]")).click();
    }

    public void pressEdit () {
        driver.findElement(By.cssSelector("img[title=\"Edit\"]")).click();
    }

    public void pressUpDate() {
        driver.findElement(By.cssSelector("input[name=\"update\"]")).click();
    }
}
