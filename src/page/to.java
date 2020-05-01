package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class to {

    WebDriver driver ;
    public to (WebDriver driver) {

        this.driver=driver;
    }

    By vTo = By.cssSelector("#ToTag");
    public WebElement vTo () {
        return driver.findElement(vTo);
    }
}
