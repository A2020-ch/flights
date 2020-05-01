package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cvv {

    WebDriver driver ;
    public cvv(WebDriver driver) {

        this.driver=driver;
    }

    By vCvv = By.xpath("//input[@id='cvvCode']");
    public WebElement vCvv () {
        return driver.findElement(vCvv);
    }
}
