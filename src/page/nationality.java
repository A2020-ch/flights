package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class nationality {

    WebDriver driver ;
    public nationality(WebDriver driver) {

        this.driver=driver;
    }

    By vNatinoality = By.xpath("/html[1]/body[1]/div[2]/section[2]/div[2]/div[4]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/dl[2]/dl[1]/dd[1]/span[1]/input[1]");
    public WebElement vNatinoality () {
        return driver.findElement(vNatinoality);
    }
}
