package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class UtilMethods {
    private static WebDriver driver;

    public static WebDriver LaunchBrowser(String url){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        return driver;
    }

    public static void selectCheckBox(WebDriver driver, By locator, String value)
    {
        driver.manage().window().maximize();
        List<WebElement> checkList = driver.findElements(locator);
        for (WebElement wb : checkList){
            if(wb.getAttribute("value").equalsIgnoreCase(value)){
                if(!wb.isSelected()){
                    wb.click();
                    break;
                }
            }
        }
    }

    public static void selectRadio(WebDriver driver, By locator, String value)
    {
        driver.manage().window().maximize();
        List<WebElement> radioList = driver.findElements(locator);
        for (WebElement wb : radioList){
            if (wb.getAttribute("value").equalsIgnoreCase(value)){
                wb.click();
            }
        }
    }

    public static void selectDDByValue(WebDriver driver, By locator, String value)
    {
        driver.manage().window().maximize();
        WebElement dd = driver.findElement(locator);
        Select ddItem = new Select(dd);
        List<WebElement> options = ddItem.getOptions();
        for (WebElement option : options){
            if(option.getAttribute("value").equalsIgnoreCase(value)){
                ddItem.selectByValue(value);
            }
        }
    }

    public static void enterFirstName(WebDriver driver, By locator, String firstName)
    {
        driver.manage().window().maximize();
        WebElement wb = driver.findElement(locator);
        wb.sendKeys(firstName);
    }
    public static void enterEmail(WebDriver driver,By locator,String Email)
    {
        driver.manage().window().maximize();
        WebElement wb = driver.findElement(locator);
        wb.sendKeys(Email);
    }

}
