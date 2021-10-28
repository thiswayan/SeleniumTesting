package flipTest;


import org.openqa.selenium.By;
import org.junit.After;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Before;
import org.junit.Test;

public class clickButtonTest {
	public static ChromeDriver driver;

	@Before
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://flip.id/");
	}
	
	@Test
	public void clickButtonBantuan() {
		driver.findElement(By.xpath("//*[@id=\"section1\"]/div[1]/div[1]/ul/li[1]/a")).click();
		
	}
	
	@Test
	public void clickButtonKarir() {
		driver.findElement(By.xpath("//*[@id=\"section1\"]/div[1]/div[1]/ul/li[2]/a")).click();
	}
	
	@Test
	public void clickButtonBiaya() {
		driver.findElement(By.xpath("//*[@id=\"section1\"]/div[1]/div[1]/ul/li[3]/a")).click(); 
	}

	@Test
	public void clickButtonMasuk() {
		driver.findElement(By.xpath("//*[@id=\"section1\"]/div[1]/div[1]/ul/li[4]/a")).click(); 
	}
	
	@After
	public void quitBrowser() {
		driver.close();
	}

}
