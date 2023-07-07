package bean.enums;

import bean.interfaces.WebApplication;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public enum Web implements WebApplication{

    CHROME{
        @Override
        public WebDriver getDriver() {
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            return new ChromeDriver();
        }
    },
    ;
}