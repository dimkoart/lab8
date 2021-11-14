import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest {

    @Test

    public void main() throws InterruptedException {

        System.setProperty("webdriver.gecko.driver","geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.avatrade.ru/");
       
        //log in

        Thread.sleep(6000);
        WebElement searchInput = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div[2]/div/div[2]/div[1]/div/span"));
        searchInput.click();
        //input email
        Thread.sleep(6000);
        searchInput = driver.findElement(By.cssSelector("#input-email"));
        searchInput.sendKeys("simolem.da@gmail.com");
        Thread.sleep(6000);
        //input password
        searchInput = driver.findElement(By.cssSelector("#input-password"));
        searchInput.sendKeys("Samoseyko123");
        Thread.sleep(6000);
        //press loggin button
        searchInput = driver.findElement(By.cssSelector(".button-wrapper > button:nth-child(1)"));
        searchInput.click();
        Thread.sleep(15000);
        //buuter menu
        searchInput = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/header/div[1]/div[1]"));
        searchInput.click();
        Thread.sleep(6000);
        //take demo version
        searchInput = driver.findElement(By.cssSelector(".menu_listItemLink_bordered__-DkmR"));
        searchInput.click();
        Thread.sleep(6000);
        //crypto categories
        searchInput = driver.findElement(By.cssSelector(".categories_select__2fZ-8"));
        searchInput.click();
        Thread.sleep(6000);
        //sell
        searchInput = driver.findElement(By.cssSelector("option.categories_option__l305Z:nth-child(20)"));
        searchInput.click();
        Thread.sleep(6000);
        //take number of sell
        searchInput = driver.findElement(By.cssSelector("tr.watchlist-entity\\.component_row__2gfNn:nth-child(1) > td:nth-child(2) > div:nth-child(1)"));
        searchInput.click();
        Thread.sleep(10000);
      //  press sell button
        searchInput = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/header/div[1]/div[1]"));
        searchInput.click();
        Thread.sleep(10000);
        //open sdelki
        searchInput = driver.findElement(By.cssSelector("li.menu_listItem__1JWUg:nth-child(4) > a:nth-child(1)"));
      searchInput.click();
        driver.quit();
    }
}
