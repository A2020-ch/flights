package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class adult {

    WebDriver driver ;
    public adult(WebDriver driver) {

        this.driver=driver;
    }

    By vAdult = By.id("Adults");
    public WebElement vAdult () {
        return driver.findElement(vAdult);
    }
}
