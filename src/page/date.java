package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class date {

    WebDriver driver ;
    public date(WebDriver driver) {

        this.driver=driver;
    }

    By vDate = By.xpath("//div[contains(@class,'searchForm clearFix')]//div[1]//dl[1]//dd[1]//div[1]//a[1]//i[1]");
    public WebElement vDate () {
        return driver.findElement(vDate);
    }
}
