import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\4ever\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//input[@id = 'name']

		driver.findElement(By.xpath("//input[@id = 'name']")).sendKeys("Abhay");
		//driver.findElement(By.id("name")).sendKeys("text");

		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		driver.switchTo().alert();
		driver.switchTo().alert().accept();
	
	

		

		//driver.findElement(By.id("confirmbtn")).click();

		//System.out.println(driver.switchTo().alert().getText());
       // driver .switchTo().alert().dismiss();

	}

}
