package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class day {

    WebDriver driver ;
    public day(WebDriver driver) {

        this.driver=driver;
    }

    By vDay = By.id("AdultDobDay1");
    public WebElement vDay () {
        return driver.findElement(vDay);
    }
}
