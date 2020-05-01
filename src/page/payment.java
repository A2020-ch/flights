package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class payment {

    WebDriver driver ;
    public payment(WebDriver driver) {

        this.driver=driver;
    }

    By vPayment = By.xpath("//input[@id='paymentSubmit']");
    public WebElement vPayment () {
        return driver.findElement(vPayment);
    }
}
