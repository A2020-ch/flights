package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class year {

    WebDriver driver ;
    public year(WebDriver driver) {

        this.driver=driver;
    }

    By vYear = By.id("AdultDobYear1");
    public WebElement vYear () {
        return driver.findElement(vYear);
    }
}
