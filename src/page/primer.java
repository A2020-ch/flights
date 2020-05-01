package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class primer {

    WebDriver driver ;
    public primer(WebDriver driver) {

        this.driver=driver;
    }

    By vBuscar = By.cssSelector("#SearchBtn");
    public WebElement vBuscar () {

        return driver.findElement(vBuscar);
    }
}
