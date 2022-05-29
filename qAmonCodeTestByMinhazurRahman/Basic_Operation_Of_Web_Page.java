package qAmonCodeTestByMinhazurRahman;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic_Operation_Of_Web_Page {

	public static void main(String[] args) throws InterruptedException {
		
		// WebDrivermanager set up for chromeBrowser
		WebDriverManager.chromedriver().setup();
				
		// WebDriver object set for chromeDriver
		WebDriver driver = new ChromeDriver();
		
		//1.URL visit 
		driver.get("https://www.demoblaze.com/index.html");
		Thread.sleep(2000);
		
		//2. Current URL Capture & Page Title Capture
		System.out.println("Current URL is: "+driver.getCurrentUrl());
		System.out.println("Page Title is: "+driver.getTitle());
		
		// 3. Navigate to Another URL
		driver.navigate().to(" https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		//4.
		driver.navigate().to("https://www.aftercareexplained.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.chhoto.link/");
		Thread.sleep(3000);
		
		//5.
		driver.close();
		
		//6.
		Thread.sleep(3000);
		driver.quit();
			

	}

}
