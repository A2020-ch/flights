package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cardholder {

    WebDriver driver ;
    public cardholder(WebDriver driver) {

        this.driver=driver;
    }

    By vCardholder = By.xpath("//div[@id='CCTab']//input[@id='BillName']");
    public WebElement vCardholder () {
        return driver.findElement(vCardholder);
    }
}
