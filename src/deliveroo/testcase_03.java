package deliveroo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class testcase_03 {
	
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
		//FAQs
		driver.findElement(By.linkText("FAQs")).click();
		//Food Safety
		driver.findElement(By.linkText("Food Safety")).click();
		
	}

}
