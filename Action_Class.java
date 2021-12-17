import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Class {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\4ever\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	  driver.get("https://www.amazon.in/");
		Actions a = new Actions(driver);
	   	 a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
	   
	 
	   	 a.moveToElement(driver.findElement(By.xpath("//span[@class='nav-text'][2]"))).click().build().perform();
	   	//Thread.sleep(2000);
	   //	driver.findElement(By.xpath("//span[@class='nav-text'][7]")).click();
	   	
		
		driver.findElement(By.xpath("//span[@class=['nav-action-inner][1]")).click();
		//a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Iphone").build().perform();
		//a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Iphone").doubleClick().build().perform();
		
		
	}

}
