import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Introduction{

	public static void main(String Args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\4ever\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//driver.get("https://rahulshettyacademy.com/#/index");
		driver.get("https://sso.teachable.com/secure/9521/identity/login");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
	     
		 //driver.findElement(By.className("form-footer")).click();
		 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("4everabhay@gmail.com");
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Abhay@1234");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		  //driver.findElement(By.xpath("//div//a[text()='Forgot Password']")).click();
		  
		  //driver.findElement(By.xpath("//a[@class='bodySmall form-footer']")).click();
		  //driver.findElement(By.cssSelector("a[href='/secure/9521/identity/sign_up']")).click();
		  //driver.findElement(By.xpath("//input[@type='email']")).sendKeys("4everabhay@gmail.com");
		
		// driver.findElement(By.xpath("//input[@type='submit']")).click();
		//.findElement(By.name("button")).click();
		 //driver.findElement(By.name("button")).click();
		 
		 
		
	
		
		
		
		
		
	}

}
