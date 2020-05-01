package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class from {

    WebDriver driver ;
    public from (WebDriver driver) {

        this.driver=driver;
    }

    By vFrom = By.cssSelector("#FromTag");
    public WebElement vFrom () {
        return driver.findElement(vFrom);
    }
}
