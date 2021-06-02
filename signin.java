package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class signin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//sayeedur//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
	       

		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("email_create")).sendKeys("svaj786@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Test");
		driver.findElement(By.id("customer_lastname")).sendKeys("Vsoft");
		driver.findElement(By.id("passwd")).sendKeys("PKR@PKR");
		driver.findElement(By.id("firstname")).sendKeys("Test User");
		driver.findElement(By.id("lastname")).sendKeys("Vsoft");
		driver.findElement(By.id("company")).sendKeys("Vsoft");
		driver.findElement(By.id("address1")).sendKeys("Test 81/1,2nd cross");
		driver.findElement(By.id("city")).sendKeys("XYZ");
		
		Select oSelect=new Select(driver.findElement(By.id("id_state")));
		oSelect.selectByValue("4");
		
		driver.findElement(By.name("postcode")).sendKeys("51838");
		
		Select oSelectC=new Select(driver.findElement(By.id("id_country")));
		oSelectC.selectByVisibleText("United States");
		
		driver.findElement(By.id("phone_mobile")).sendKeys("234567890");
		driver.findElement(By.id("alias")).clear();
		driver.findElement(By.id("alias")).sendKeys("Office");
		driver.findElement(By.id("submitAccount")).click();
		
		String userText=driver.findElement(By.xpath("//a[@class='account']")).getText();
		
		if(userText.contains("Vsoft"))
		{
			System.out.println("User Verified,Test case Passed");
		}
		else
		{
			System.out.println("User Verification Failed,Test case Failed");
		}
		driver.close();
	}

}
