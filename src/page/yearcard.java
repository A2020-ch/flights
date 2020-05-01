package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class yearcard {

    WebDriver driver ;
    public yearcard(WebDriver driver) {

        this.driver=driver;
    }

    By vYearcard = By.xpath("//dd[@class='expirydate']//select[@id='CcExpirationYear']");
    public WebElement vYearcard () {
        return driver.findElement(vYearcard);
    }
}
