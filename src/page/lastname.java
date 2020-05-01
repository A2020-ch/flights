package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class lastname {

    WebDriver driver ;
    public lastname(WebDriver driver) {

        this.driver=driver;
    }

    By vLastname = By.id("/html[1]/body[1]/div[2]/section[2]/div[2]/div[4]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/dl[1]/dd[1]/input[2]");
    public WebElement vLastname () {
        return driver.findElement(vLastname);
    }
}
