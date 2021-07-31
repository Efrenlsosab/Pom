package com.co.sofkau.web.controllers;

import com.co.sofkau.web.pages.SoucedemoHomePage;
import com.co.sofkau.web.pages.SoucedemoLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BCSoucedemo {

    public static void startApp(WebDriver driver, String url) {
        driver.get(url);
    }

    public static void loginUser(WebDriver driver, String username, String password){
        SoucedemoLoginPage loginPage = new SoucedemoLoginPage(driver);
        loginPage.getInputUser().sendKeys(username);
        loginPage.getInputPassword().sendKeys(password);
        loginPage.getButtonLogin().click();

    }

    public static String getTitleHome(WebDriver driver) {
        SoucedemoHomePage homePage = new SoucedemoHomePage(driver);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(homePage.getTitleHome()));
        return homePage.getTitleHome().getText();
    }
}
