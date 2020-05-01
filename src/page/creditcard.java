package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class creditcard {

    WebDriver driver ;
    public creditcard(WebDriver driver) {

        this.driver=driver;
    }

    By vCreditcard = By.cssSelector("#creditCardNumberDisp");
    public WebElement vCreditcard () {
        return driver.findElement(vCreditcard);
    }
}
