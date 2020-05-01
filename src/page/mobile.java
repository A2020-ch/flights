package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mobile {

    WebDriver driver ;
    public mobile(WebDriver driver) {

        this.driver=driver;
    }

    By vMobile = By.xpath("//dl[@class='horizontal travellers row last']//input[@id='mobileNumber']");
    public WebElement vMobile () {
        return driver.findElement(vMobile);
    }
}
