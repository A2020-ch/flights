package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class date1 {

    WebDriver driver ;
    public date1(WebDriver driver) {

        this.driver=driver;
    }

    By vDate1 = By.xpath("/html[1]/body[1]/div[2]/div[2]/table[1]/tbody[1]/tr[3]/td[6]/a[1]");
    public WebElement vDate1 () {
        return driver.findElement(vDate1);
    }
}
