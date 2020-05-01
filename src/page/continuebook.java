package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class continuebook {

    WebDriver driver ;
    public continuebook(WebDriver driver) {

        this.driver=driver;
    }

    By vContinuebook = By.xpath("//button[@id='priceChangeDownBtn']");
    public WebElement vContinuebook () {
        return driver.findElement(vContinuebook);
    }
}
