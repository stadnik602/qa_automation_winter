package loginflow;

import com.next.next.driver.Hooks;
import com.next.next.driver.cash.WebDriverCash;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;



public class BaseTest {

    protected static WebDriver driver;
    protected static WebDriverWait webDriverWait;

    @BeforeAll
    public static void setUp() {
        driver = WebDriverCash.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.next.co.uk/");
        Hooks.tryCloseCookie(driver);
        Hooks.tryCloseChangeCountrySidebar(driver);
    }

    @AfterAll
    public static void driverTearDown() {
        driver.quit();

    }
}
