package com.co.sofkau.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SoucedemoHomePage {
    @FindBy(how = How.XPATH, using = "//*[@class='title']")
    private WebElement titleHome;
    public SoucedemoHomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public WebElement getTitleHome() {
        return titleHome;
    }
}
