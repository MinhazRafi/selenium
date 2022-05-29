package qAmonCodeTestByMinhazurRahman;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElement_Execution_Test {

	public static void main(String[] args) throws InterruptedException {
		
		// WebDrivermanager set up for chromeBrowser
		WebDriverManager.chromedriver().setup();
						
		// WebDriver object set for chromeDriver
		WebDriver driver = new ChromeDriver();
				
		//1.URL visit 
		driver.get("https://www.nexchar.com/signup");
		Thread.sleep(2000);
		
		//2. Id:
		WebElement username= driver.findElement(By.id("Name"));
		Thread.sleep(300);
		username.click();
		Thread.sleep(3000);
		username.sendKeys("gift_shop");
		
		//dropdown testing
		Select dropdownbox = new Select(driver.findElement(By.id("CategoryId")));
		Thread.sleep(3000);
		dropdownbox.selectByVisibleText("Homeware and furniture");
		Thread.sleep(3000);
		
		//email
		driver.findElement(By.id("Email")).sendKeys("rafi@gmail.com");
		Thread.sleep(3000);
		
		//password
		driver.findElement(By.name("Password")).sendKeys("12345");
		Thread.sleep(3000);
		
		//checkbox
		driver.findElement(By.xpath("//input[@id='NotReceiveNewsLetter']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(3000);
		driver.navigate().to("https://www.nexchar.com/signin");
		
		//signin--email
		driver.findElement(By.id("Email")).sendKeys("gift_shop");
		Thread.sleep(3000);
		driver.findElement(By.name("Password")).sendKeys("12345");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		

	}

}
