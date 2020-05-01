package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class continuebook2 {

    WebDriver driver ;
    public continuebook2(WebDriver driver) {

        this.driver=driver;
    }

    By vContinuebook2 = By.xpath("//button[@id='priceChangeDownBtn']");
    public WebElement vContinuebook2 () {
        return driver.findElement(vContinuebook2);
    }
}
