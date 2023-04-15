package com.selenium.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LoginSteps {


    public static WebDriver driver;


    @FindBy(id = "nav-al-signin")
    static
    WebElement btnSignIn;

    public static void login()
    {
        System.out.println(driver);
        driver.navigate().to("https://www.amazon.sg/prime");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Actions act = new Actions(driver);
        act.moveToElement(btnSignIn).click();
    }

}
