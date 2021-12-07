import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\4ever\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String password = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//driver.findElement(By.id("inputUsername")).sendKeys("4everabhay@gmail.com");
		//driver.findElement(By.name("inputPassword")).sendKeys("Abhay@1234");
		driver.findElement(By.name("chkboxOne")).click();
		driver.findElement(By.name("chkboxTwo")).click();
		driver.findElement(By.xpath("//div/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Abhay Kumar");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("4everabhay@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9304451262");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		driver.findElement(By.className("go-to-login-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("inputUsername")).sendKeys("4everabhay@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("submit")).click();
	    //System.out.println(driver.findElement(By.tagName("h2")).getText());
		  driver.findElement(By.className("logout-btn")).click();
		 driver.close();
	}



public static  String getPassword(WebDriver driver) throws InterruptedException {
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.linkText("Forgot your password?")).click();
	Thread.sleep(1000);

	driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

	String passwordText =driver.findElement(By.cssSelector("form p")).getText();
	String[] passwordArray = passwordText.split("'");

	String password = passwordArray[1].split("'")[0];
	return password;
}}

		  
		
	
		
		




