package flipTest;

import java.sql.Array;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.ReadExcel;

public class DatabseUITest {


	 @SuppressWarnings({ "static-access", "unchecked" }) 
	 public static void main(String[] args) throws Exception 
	 { 

	 System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");


	 ChromeDriver driver = new ChromeDriver();

	 DBTestData db = new DBTestData(); 

	 // ENTER URL
	 driver.get("http://www.uidashboard.com/");

	 try
	 {

	 ResultSet testData = db.data("", "", "", "", "");

	 do 
	 {
	   String ID = testData.getString(1);
	   String userName = testData.getString(2);
	   String sourceBank = testData.getString(3);
	   String destinationBank = testData.getString(4);
	   String amount = testData.getString(5);

	   driver.findElement(By.id("u_0_e")).clear();
	   driver.findElement(By.id("u_0_e")).sendKeys(ID);
	   driver.findElement(By.id("u_0_g")).clear();
	   driver.findElement(By.id("u_0_g")).sendKeys(userName); 
	   driver.findElement(By.id("u_0_h")).clear();
	   driver.findElement(By.id("u_0_h")).sendKeys(sourceBank); 
	   driver.findElement(By.id("u_0_i")).clear();
	   driver.findElement(By.id("u_0_i")).sendKeys(destinationBank); 
	   driver.findElement(By.id("u_0_j")).clear();
	   driver.findElement(By.id("u_0_j")).sendKeys(amount); 
	 }
	 while(testData.next()); 



	 }
	 catch (Exception e)
	 {
	 e.printStackTrace();
	 }
	 finally 
	 { 
	 driver.quit(); 
	 }
	 }
}
