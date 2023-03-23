import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Private24Test {
    static WebDriver driver;
    static WebDriverWait wait;

    @BeforeMethod
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Kostik/Hillel Course/qa_automation_winter/Task9/src/test/java/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    @Test
    public void checkSiteIsOpened() {
        driver.get("https://next.privat24.ua/");
        String actualResult = driver.getTitle();
        String expectedResult = "Інтернет-банк, доступний кожному";
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void checkLoginFormIsDisplayed() {
        driver.get("https://next.privat24.ua/");
        WebElement buttonLogin = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@data-qa-node='login']")));
        buttonLogin.click();

        WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@src='https://login-widget.privat24.ua/']")));
        driver.switchTo().frame(iframe);

        String expectedResult = "Вхід у Приват24";
        WebElement formTitle = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2")));
        String actualResult = formTitle.getText();
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void checkLoginFormIsClosed() {
        driver.get("https://next.privat24.ua/");
//        String mainWindow = driver.getWindowHandle();
        WebElement buttonLogin = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@data-qa-node='login']")));
        buttonLogin.click();

        WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@src='https://login-widget.privat24.ua/']")));
        driver.switchTo().frame(iframe);

        WebElement formTitle = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2")));
        WebElement closeButton = driver.findElement(By.xpath("//div[@class='close_ss159TRy3k']"));
        closeButton.click();
//        driver.switchTo().window(mainWindow);
        Assert.assertFalse(!formTitle.isDisplayed());
    }

    @Test
    public void checkCategoryIsPresentsInList() {
        driver.get("https://next.privat24.ua/payments");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-qa-node='category']/div[2]")));
        List<WebElement> allCategory = driver.findElements(By.xpath("//div[@data-qa-node='category']/div[2]"));
        List<String> categoryList = new ArrayList<>();
        String expectedCategory = "Податки та збори";

        for(WebElement element : allCategory) {
            categoryList.add(element.getText());
        }

        Assert.assertTrue(categoryList.contains(expectedCategory));
    }

    @AfterMethod
    public static void closeBrowser() {
        driver.quit();
    }
}
