package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class continue3 {

    WebDriver driver ;
    public continue3(WebDriver driver) {

        this.driver=driver;
    }

    By vContinue3 = By.xpath("/html[1]/body[1]/div[2]/section[2]/div[2]/div[4]/div[1]/div[1]/form[1]/dl[2]/dd[2]/input[1]");
    public WebElement vContinue3 () {
        return driver.findElement(vContinue3);
    }
}
