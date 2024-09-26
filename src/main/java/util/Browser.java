package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser {
    private WebDriver driver;

    public void launchBrowser(String browserName){
        if(browserName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pankaj Bhambhani\\Downloads\\chromedriver\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver", "");
            driver = new EdgeDriver();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
    public void maximize(){
        driver.manage().window().maximize();
    }
    public void navigateUrl(String url){
        driver.get(url);
    }
    public void closeBrowser(){
        driver.close();
    }
}
