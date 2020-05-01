package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class book {

    WebDriver driver ;
    public book(WebDriver driver) {

        this.driver=driver;
    }

    By vBook = By.xpath("/html[1]/body[1]/div[2]/section[2]/div[2]/div[4]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/dl[1]/dd[1]/select[1]/option[2]");
    public WebElement vBook () {
        return driver.findElement(vBook);
    }
}


//*[@id="flightForm"]/section[2]/div[4]/div/nav/ul/li[1]/table/tbody[2]/tr[2]/td[3]/button