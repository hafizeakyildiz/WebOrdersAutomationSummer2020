package com.weborders.pages;

import com.weborders.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(tagName = "h1")
    private WebElement pageTitleElement;

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public String getPageTitleTex(){
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return pageTitleElement.getText().trim();
    }



}
