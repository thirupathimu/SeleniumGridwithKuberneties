package com.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class SeleniumGrid {
	WebDriver driver;
    String baseURL, nodeURL;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        baseURL = "https://www.google.co.in/";
        nodeURL = "http://52.176.4.254:4444/wd/hub";
        //nodeURL="http://10.244.1.6:5555/wd/hub";
        DesiredCapabilities capability = DesiredCapabilities.chrome();
        capability.setBrowserName("chrome");
        capability.setPlatform(Platform.LINUX);
        driver = new RemoteWebDriver(new URL(nodeURL), capability);
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
    @Test
    public void sampleTest() {
        driver.get(baseURL);
       // driver.get(baseURL);
 String s=driver.getTitle();
 System.out.println(s);
       driver.findElement(By.name("q")).sendKeys("testing");

    }
    @Test
    public void sampleTest1() {
        driver.get(baseURL);
       // driver.get(baseURL);
        String s=driver.getTitle();
        System.out.println(s);
        driver.findElement(By.name("q")).sendKeys("automation testing");
    }
    @Test
    public void sampleTest2() {
        driver.get(baseURL);
       // driver.get(baseURL);
        String s=driver.getTitle();
        System.out.println(s);
        driver.findElement(By.name("q")).sendKeys("azure ");

    }
    @Test
    public void sampleTest3() {
        driver.get(baseURL);
       // driver.get(baseURL);
        String s=driver.getTitle();
        System.out.println(s);
        driver.findElement(By.name("q")).sendKeys("docker");

    }
    @Test
    public void sampleTest4() {
        driver.get(baseURL);
       // driver.get(baseURL);
        String s=driver.getTitle();
        System.out.println(s);
        driver.findElement(By.name("q")).sendKeys("Kuberneties");
    }
}
