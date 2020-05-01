package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class vuelo {

    WebDriver driver ;
    public vuelo(WebDriver driver) {

        this.driver=driver;
    }

    By vVuelo = By.xpath("/html[1]/body[1]/section[2]/div[1]/div[1]/div[1]/form[1]/nav[1]/ul[1]/li[1]/label[1]/input[1]");
    public WebElement vVuelo () {

        return driver.findElement(vVuelo);
    }
}
