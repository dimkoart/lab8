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

        Thread.sleep(10000);
        WebElement searchInput = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div[2]/div/div[2]/div[1]/div/span"));
        searchInput.click();
        //input email
        Thread.sleep(10000);
        searchInput = driver.findElement(By.cssSelector("#input-email"));
        searchInput.sendKeys("simolem.da@gmail.com");
        Thread.sleep(10000);
        //input password
        searchInput = driver.findElement(By.cssSelector("#input-password"));
        searchInput.sendKeys("Samoseyko123");
        Thread.sleep(10000);
        //press loggin button
        searchInput = driver.findElement(By.cssSelector(".button-wrapper > button:nth-child(1)"));
        searchInput.click();
        Thread.sleep(10000);
        //buuter menu
        searchInput = driver.findElement(By.cssSelector(".button\.children_container_burger__1l-wp"));
        searchInput.click();
        Thread.sleep(10000);
        //take demo version
        searchInput = driver.findElement(By.cssSelector("a.menu-list-item_container__3R8F7:nth-child(9) > span:nth-child(2) > span:nth-child(1)"));
        searchInput.click();
        Thread.sleep(10000);
        //crypto categories
        searchInput = driver.findElement(By.cssSelector("a.categories_link__3tp-F:nth-child(14)"));
        searchInput.click();
        Thread.sleep(10000);
        //sell
        searchInput = driver.findElement(By.cssSelector("tr.watchlist-entity\\.component_row__2xsrx:nth-child(1) > td:nth-child(4) > div:nth-child(1) > div:nth-child(1)"));
        searchInput.click();
        Thread.sleep(10000);
        //take number of sell
        searchInput = driver.findElement(By.cssSelector(".order-entry-panel_amountStepper__1U2lg > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)"));
        searchInput.sendKeys("");
        Thread.sleep(10000);
        searchInput.sendKeys("10");
        Thread.sleep(10000);
        //press sell button
        searchInput = driver.findElement(By.cssSelector(".button\\.child_container__2Gdpz"));
        searchInput.click();
        Thread.sleep(10000);
        //open sdelki
        searchInput = driver.findElement(By.cssSelector("li.aside_item__2xlHs:nth-child(3) > a:nth-child(1)"));
        searchInput.click();
        driver.quit();
    }
}
