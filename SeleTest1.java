package MyPack;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SeleTest1 {
	@Test
	public void myfuction() {
		System.getProperty("webdriver.chrome.driver", "C:\\Users\\mridu\\Desktop\\chromedriver-win64\\chromedriver.exe");
		WebDriver obj = new ChromeDriver();
		obj.manage().window().maximize();
		obj.get("https://www.google.com/gmail/about/");
		obj.manage().window().maximize();
		obj.findElement(By.xpath("/html/body/header/div/div/div/a[2]")).click();
		obj.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("xynnsdc@gmail.com",Keys.ENTER);
	}
}