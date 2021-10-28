package flipTest;

import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.After;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AssetionTest {
	public static ChromeDriver driver;

	@Before
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://flip.id/");
	}
	
	@Test
	public void checkTextBantuan() {
		String text = "Bantuan";
		Assert.assertEquals(text,driver.findElement(By.xpath("//*[@id=\"section1\"]/div[1]/div[1]/ul/li[1]/a")).getText()); 
		System.out.println(driver.findElement(By.xpath("//*[@id=\"section1\"]/div[1]/div[1]/ul/li[1]/a")).getText());  
	}
	
	@Test
	public void checkTextKarir() {
		String text = "Karir";
		Assert.assertEquals(text,driver.findElement(By.xpath("//*[@id=\"section1\"]/div[1]/div[1]/ul/li[2]/a")).getText()); 
		System.out.println(driver.findElement(By.xpath("//*[@id=\"section1\"]/div[1]/div[1]/ul/li[2]/a")).getText());  
	}
	
	@Test
	public void checkTextBiaya() {
		String text = "Biaya";
		Assert.assertEquals(text,driver.findElement(By.xpath("//*[@id=\"section1\"]/div[1]/div[1]/ul/li[3]/a")).getText()); 
		System.out.println(driver.findElement(By.xpath("//*[@id=\"section1\"]/div[1]/div[1]/ul/li[3]/a")).getText());  
	}

	@Test
	public void checkTextMasuk() {
		String text = "Masuk";
		Assert.assertEquals(text,driver.findElement(By.xpath("//*[@id=\"section1\"]/div[1]/div[1]/ul/li[4]/a")).getText()); 
		System.out.println(driver.findElement(By.xpath("//*[@id=\"section1\"]/div[1]/div[1]/ul/li[4]/a")).getText());  
	}
	
	@After
	public void quitBrowser() {
		driver.close();
	}

}
