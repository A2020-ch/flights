package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.*;

import java.util.concurrent.TimeUnit;

public class cleartrip {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cleartrip.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        vuelo vuelos;
        from salirde;
        to hasta;
        date fecha;
        date1 fecha1;
        adult señor;
        children bebe;
        primer primero;
        book libro;
        continuebook continualibro;
        continuebook2 continualibro2;
        title genero;





        vuelos = new vuelo(driver);
        vuelos.vVuelo().click();
        salirde = new from(driver);
        salirde.vFrom().sendKeys("Lima, PE - Jorge Chavez (LIM)");
        hasta =new to(driver);
        hasta.vTo().sendKeys("Buenos Aires, AR - Jorge Newbery (AEP)");
        fecha = new date(driver);
        fecha.vDate().click();
        fecha1 = new date1(driver);
        fecha1.vDate1().click();
        señor = new adult(driver);
        señor.vAdult().click();
        señor.vAdult().findElement(By.xpath("//select[@id='Adults']//option[contains(text(),'1')]")).click();
        bebe = new children(driver);
        bebe.vChildren().click();
        bebe.vChildren().findElement(By.xpath("//select[@id='Childrens']//option[contains(text(),'0')]")).click();
        primero = new primer(driver);
        primero.vBuscar().click();
        libro = new book(driver);
        libro.vBook().click();
        continualibro = new continuebook(driver);
        continualibro.vContinuebook().click();
        continualibro2 = new continuebook2(driver);
        continualibro2.vContinuebook2().click();
        genero = new title(driver);
        genero.vTitle().click();
        genero.vTitle().findElement(By.cssSelector("body.bookFlow:nth-child(2) div.container:nth-child(5) section.row.block.relative:nth-child(22) div.travellerOpen.openBlock div.infoBlock.relative:nth-child(4) div.row div.colZero.col20 div.blockOptInBG.clearFix.active:nth-child(2) div.blockOptInPAD.clearFix.active div.blockOptIn.clearFix.active dl.horizontal.travellers:nth-child(1) dd:nth-child(2) select.required.travellerTitle.title.span:nth-child(1) > option:nth-child(2)")).click();














    }
}
