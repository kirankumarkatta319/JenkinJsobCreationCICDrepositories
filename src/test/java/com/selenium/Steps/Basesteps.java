package com.selenium.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Basesteps {


   // public static WebDriver driver;
    public static void browserInitialization()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\IdeaProjects\\JenkinJsobCreationCICDrepositories\\src\\test\\resources\\webdriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.sg/prime");
        System.out.println("browser initialization completed");
    }

}
