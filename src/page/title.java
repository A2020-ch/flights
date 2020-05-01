package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class title {

    WebDriver driver ;
    public title(WebDriver driver) {

        this.driver=driver;
    }

    By vTitle = By.xpath("//div[@class='blockOptIn clearFix active']//select[@id='AdultTitle1']");
    public WebElement vTitle () {
        return driver.findElement(vTitle);
    }
}
