package redcompany.redarmy;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.List;


@Component
public class DisneyContestBot {

    private WebDriver webDriver;

    //String driverFile = findFile();
    //DesiredCapabilities capabilities = this
    public void executeScript() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--no-sandbox"); // Bypass OS security model, MUST BE THE VERY FIRST OPTION
        //options.addArguments("--headless");
        //options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("start-maximized"); // open Browser in maximized mode
        options.addArguments("--disable-infobars"); // disabling infobars
        options.addArguments("--disable-extensions"); // disabling extensions
        //options.addArguments("--disable-gpu"); // applicable to windows os only
        //options.addArguments("--disable-dev-shm-usage");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.skyradio.nl/acties/luister-naar-sky-radio-en-win-1-jaar-gratis-leven");

        Thread.sleep(5000);
        WebElement akoordCookies = driver.findElement(By.id("onetrust-accept-btn-handler"));
        //.element.getText();
        akoordCookies.click();
        Thread.sleep(3000);
        //driver.navigate().refresh();


        //((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 1700);");

        //WebElement element2 = driver.findElement(By.tagName("title"));
        //System.out.println("displayed: " + element2.isDisplayed());
        //System.out.println("enabled: " + element2.isEnabled());
       // System.out.println("selected: " + element2.isSelected());

       // Thread.sleep(5000);

        // Wait until the element is visible and interactable

        //WebElement link = driver.findElement(By.linkText("hier"));
       // Thread.sleep(8000);
        WebElement shadowHost = driver.findElement(By.cssSelector(".mui-1wajxqp"));
        SearchContext shadowRoot =shadowHost.getShadowRoot();

        WebElement element1 = shadowRoot.findElement(By.cssSelector(".qualifio_iframe_tag"));
        driver.switchTo().frame(element1);

        Thread.sleep(3000);


        WebElement element = driver.findElement(By.id("reponse"));
        //username = driver.find_element(By.XPATH, "//form[input/@name='username']")
        element.sendKeys("energie");
        element.sendKeys(Keys.ENTER);
        Thread.sleep(4000);
        WebElement Voorname = driver.findElement(By.id("choix_993410"));
        Thread.sleep(300);
        Voorname.sendKeys("J.A");
        Voorname.sendKeys(Keys.TAB);
        driver.switchTo().activeElement().sendKeys("Marrero");
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        driver.switchTo().activeElement().sendKeys("robertorojas20@gmail.com");
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        driver.switchTo().activeElement().sendKeys("0610905931");
        driver.switchTo().activeElement().sendKeys(Keys.TAB);

        driver.switchTo().activeElement().sendKeys("HEERHUGOWAARD");
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        driver.switchTo().activeElement().sendKeys(Keys.SPACE);
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        //driver.switchTo().activeElement().sendKeys(Keys.SPACE);
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        driver.switchTo().activeElement().sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        driver.close();
        driver.quit();
        Thread.sleep(2000);

    }
}
