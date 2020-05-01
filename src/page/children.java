package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class children {

    WebDriver driver ;
    public children (WebDriver driver) {

        this.driver=driver;
    }

    By vChildren = By.id("Childrens");
    public WebElement vChildren () {
        return driver.findElement(vChildren);
    }
}
