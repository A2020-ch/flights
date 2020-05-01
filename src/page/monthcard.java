package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class monthcard {

    WebDriver driver ;
    public monthcard(WebDriver driver) {

        this.driver=driver;
    }

    By vMonthcard = By.xpath("//dd[@class='expirydate']//select[@id='CcExpirationMonth']");
    public WebElement vMonthcard () {
        return driver.findElement(vMonthcard);
    }
}
