import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart_loginFunctionality {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\4ever\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("4everabhay@gmail.com");
	    driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Abhay@123");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("iphone 12");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		  
		List<WebElement> options = driver.findElements(By.xpath("//div[@class ='_4rR01T']"));
		 Thread.sleep(2000);
		 for(WebElement option:options)
		 {
		 if (option.getText().equalsIgnoreCase("APPLE iPhone 12 (Red, 64 GB))"))
			 option.click();
			 
			 else 
			 {
				 System.out.println("No item is found"); 
			 }
				 
		 }
		 
	}

}
