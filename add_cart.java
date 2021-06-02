package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class add_cart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C://Users//sayeedur//Downloads//chromedriver_win32 (1)//chromedriver.exe");
	       	WebDriver driver=new ChromeDriver();
	        String URL="http://automationpractice.com/index.php";
	        driver.get(URL);
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	        driver.findElement(By.linkText("Sign in")).click();
	        driver.findElement(By.id("email")).sendKeys("svaj786@gmail.com");
	        driver.findElement(By.id("passwd")).sendKeys("PKR@PKR");
	        driver.findElement(By.id("SubmitLogin")).click();
	        driver.findElement(By.linkText("WOMEN")).click();
	        WebElement SecondImg=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[2]/ul/li[2]/div/div[1]/div/a[1]/img"));
	        WebElement MoreBtn=driver.findElement(By.xpath("/html/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul/li[2]/div[1]/div[2]/div[2]/a[2]"));
	        Actions actions=new Actions(driver);
	        actions.moveToElement(SecondImg).moveToElement(MoreBtn).click().perform();
	        driver.findElement(By.id("quantity_wanted")).clear();
	        driver.findElement(By.id("quantity_wanted")).sendKeys("2");
	        WebElement Sizedrpdwn=driver.findElement(By.xpath("//*[@id='group_1']"));
	        Select oSelect=new Select(Sizedrpdwn);
	        oSelect.selectByVisibleText("M");
	        driver.findElement(By.id("color_11")).click();
	        driver.findElement(By.xpath("//p[@id='add_to_cart']//span[.='Add to   cart']")).click();
	        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/header[1]/div[3]/d iv[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/p[2]/a[1]/span")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span")).click();
			driver.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/form/p/button/span")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div[3]/div[2]/div/p/a")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span")).click();
			String ConfirmationText=driver.findElement(By.xpath("//div[@id='center_column']/p[@class='alert alert-success']")).getText();
			if(ConfirmationText.contains("complete"))
			{
				System.out.println("Order Completed: Test Case Passed");
			}
			else
			{
				System.out.println("Order Not Successfull: Test Case Failed");
			}
			driver.close();

	}

}
