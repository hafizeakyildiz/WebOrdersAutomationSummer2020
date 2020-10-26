package com.weborders.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    //reference variable, pointer on object
    //if reference variable does not point on any object it will have a null value
    //whenever we type new Class() - we create new object
    //reference type can be class, parent class, or interface implemented by class or parent
    //since webDriver is an interface implemented by RemoteWebDriver class
    //and RemoteWebDriver is a parent class of chromeDriver, FireFoxDriver,etc...
    //we can specify reference type in a run time(polymorphism)


    private static WebDriver driver;
    private Driver(){}

    public static WebDriver getDriver(){
       if (driver == null){
           String browser ="chrome";
           switch(browser){
               case "chrome":
                   WebDriverManager.chromedriver().setup();
                   driver=new ChromeDriver();
                   break;
               case "firefox":
                   WebDriverManager.firefoxdriver().setup();
                   driver=new FirefoxDriver();
                   break;
               default:
                   throw new RuntimeException("Browser is not implemented yte: "+browser);
           }

       }
       return driver;
    }
}
