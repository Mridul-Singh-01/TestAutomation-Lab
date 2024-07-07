package Mypack;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTest {
	public void myfuction() {
		System.getProperty("webdriver.chrome.driver", "C:\\Users\\mridu\\Desktop\\chromedriver-win64\\chromedriver.exe");
		WebDriver obj = new ChromeDriver();
		obj.manage().window().maximize();
		obj.get("https://www.amazon.in//");
		obj.manage().window().maximize();
		String currentHandle= obj.getWindowHandle();
		// Searching for Headphones
		obj.findElement(By.id("twotabsearchtextbox")).sendKeys("Headphones", Keys.ENTER);
	}
}
