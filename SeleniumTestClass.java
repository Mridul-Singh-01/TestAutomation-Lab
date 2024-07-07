package MyPackageTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {
		@Test
		public void myfuction() {
			System.getProperty("webdriver.chrome.driver", "C:\\Users\\mridu\\Desktop\\chromedriver-win64\\chromedriver.exe");
			WebDriver obj = new ChromeDriver();
			obj.manage().window().maximize();
			obj.get("file:///C:/Users/mridu/Desktop/Programming/WebDev/Lib.html");
			obj.manage().window().maximize();
			obj.findElement(By.id("title")).sendKeys("Maths is Life");
			obj.findElement(By.id("author")).sendKeys("RD Sharma", Keys.ENTER);
		}
}
