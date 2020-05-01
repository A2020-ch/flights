package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class firstname {

    WebDriver driver ;
    public firstname(WebDriver driver) {

        this.driver=driver;
    }

    By vFirstname = By.xpath("/html[1]/body[1]/div[2]/section[2]/div[2]/div[4]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/dl[1]/dd[1]/input[1]");
    public WebElement vFirstname () {
        return driver.findElement(vFirstname);
    }
}
