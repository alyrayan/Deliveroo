package deliveroo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testcase_06 {
	
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty
		 ("webdriver.chrome.driver", 
		  "C:\\Users\\Rayan\\eclipse-workspace\\deliveroo\\sources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//open website 
		driver.navigate().to("https://deliveroo.co.uk/");
		Thread.sleep(1000);
		//Accept Cookies 
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		//menu
		driver.findElement(By.className("ccl-435d1b0dc2ca935e")).click();
		//countries list
		Select list = new Select(driver.findElement(By.id("countries-picker")));
		//select Qatar
		list.selectByVisibleText("Qatar");
		
		

	
		
	}

}