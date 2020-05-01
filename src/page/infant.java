package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class infant {

    WebDriver driver ;
    public infant(WebDriver driver) {

        this.driver=driver;
    }

    By vinfant = By.id("Infants");
    public WebElement vinfant () {
        return driver.findElement(vinfant);
    }
}
