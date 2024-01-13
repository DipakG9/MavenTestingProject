package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static utils.UtilMethods.*;

public class WebTesting {
    public WebDriver driver = LaunchBrowser("https://demo.automationtesting.in/Register.html");

    @Test
    public void CheckboxFunctionality(){
        selectCheckBox(driver, By.xpath("//input[@type='checkbox']"), "Cricket");
        selectCheckBox(driver, By.xpath("//input[@type='checkbox']"), "Movies");
    }

    @Test
    public void RadioFunctionality(){
        selectRadio(driver, By.xpath("//input[@type='radio']"), "Male");
    }

    @Test
    public void DropDownByValue(){
        selectDDByValue(driver, By.id("Skills"), "Adobe InDesign");
    }

    @Test
    public void EnterFirstName(){
        enterFirstName(driver, By.xpath("//input[@ng-model='FirstName']"), "Vinod");
    }
//    public void EnterEmail(){
//        enterEmail(driver,By.xpath("//input[@ng-model='EmailAdress']"), "");
//    }
}
