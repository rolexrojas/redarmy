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
        options.addArguments("--no-sandbox"); // Bypass OS security model, MUST BE THE VERY FIRST OPTION
        //options.addArguments("--headless");
        //options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("start-maximized"); // open Browser in maximized mode
        options.addArguments("disable-infobars"); // disabling infobars
        options.addArguments("--disable-extensions"); // disabling extensions
        //options.addArguments("--disable-gpu"); // applicable to windows os only
        //options.addArguments("--disable-dev-shm-usage");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.skyradio.nl/acties/luister-naar-sky-radio-en-win-1-jaar-gratis-leven");
        Thread.sleep(1500);
        WebElement akoordCookies = driver.findElement(By.id("onetrust-accept-btn-handler"));
        //.element.getText();
        akoordCookies.click();
        Thread.sleep(1000);
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



        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("arguments[0].scrollIntoView(true)", link);
        ///link.sendKeys(Keys.TAB);
        //link.sendKeys(Keys.TAB);
        //link.sendKeys(Keys.TAB);
        //link.sendKeys(Keys.TAB);
        driver.switchTo().frame("qualifio-4B04B8D7-74D1-424C-AA85-9B1B246E19C9");
        Thread.sleep(5000);
        WebElement element = driver.findElement(By.id("reponse"));
        //username = driver.find_element(By.XPATH, "//form[input/@name='username']")
        element.sendKeys("GRATIS");
        element.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        WebElement Voorname = driver.findElement(By.id("choix_993410"));
        Voorname.sendKeys("J.A");
        Voorname.sendKeys(Keys.TAB);
        driver.switchTo().activeElement().sendKeys("MARRERO");
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        driver.switchTo().activeElement().sendKeys("0684784289");
        driver.switchTo().activeElement().sendKeys(Keys.TAB);

        driver.switchTo().activeElement().sendKeys("HEERHUGOWAARD");
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        driver.switchTo().activeElement().sendKeys(Keys.SPACE);
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        driver.switchTo().activeElement().sendKeys(Keys.SPACE);
        //driver.switchTo().activeElement().sendKeys(Keys.TAB);
        driver.switchTo().activeElement().sendKeys(Keys.ENTER);
        Thread.sleep(3000);

        driver.close();
        driver.quit();
        Thread.sleep(2000);


    }
}
