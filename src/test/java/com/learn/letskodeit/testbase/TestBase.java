package com.learn.letskodeit.testbase;

import com.learn.letskodeit.basepage.BasePage;
import com.learn.letskodeit.browserselector.BrowserSelector;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by Chaitanya
 */
//test base class extends with base page class
public class TestBase extends BasePage {
    //object created for browser selector
    BrowserSelector browserSelector = new BrowserSelector();
    //string to define URL of website
    String baseUrl = "https://learn.letskodeit.com/";
    //before method of testNG
    @BeforeMethod

    public void openBrowser() {
        //browser opening
        browserSelector.selectBrowser("chrome");
        // driver.manage().window().setPosition(new Point(2000, 0));//display into second screen
        driver.manage().window().maximize();
        //driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }
    //after method of testNG
    @AfterMethod
    //browser closing
    public void tearDown() {
        driver.quit();


    }
}