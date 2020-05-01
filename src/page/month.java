package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class month {

    WebDriver driver ;
    public month(WebDriver driver) {

        this.driver=driver;
    }

    By vMonth = By.id("AdultDobMonth1");
    public WebElement vMonth () {
        return driver.findElement(vMonth);
    }
}
