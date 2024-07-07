package MypackTest;
import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MyWebTest {

    private WebDriver driver;
    private String baseUrl = "file:///C:/Users/mridu/Desktop/Programming/WebDev/index.html";

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mridu\\Desktop\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        return new Object[][] {
                { "user1", "password1", "Login successful" },
                { "user1", "wrongpassword", "Incorrect password" },
                { "user2", "1234", "Login successful" }
        };
    }

    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password, String expectedMessage) {
        WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));

        usernameInput.clear();
        usernameInput.sendKeys(username);
        passwordInput.clear();
        passwordInput.sendKeys(password);
        submitButton.click();

        WebElement messageElement = driver.findElement(By.id("message"));
        Assert.assertEquals(messageElement.getText(), expectedMessage);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}