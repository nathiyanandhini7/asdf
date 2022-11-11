package ebay;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebayy {

	public static void main(String[] args) throws InterruptedException {
       
		System.setProperty("webdriver.chrome.driver", "G:\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		// Perform the click operation that opens new window
		driver.findElement(By.xpath("//button[@id='gh-shop-a']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Electronics']")).click();
		//Thread.sleep(2000);
			
		driver.findElement(By.xpath("//span[contains(text(),'Cell Phones & Accessories')]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Cell Phones & Smartphones')]")).click();
		//Thread.sleep(2000);
				
		driver.findElement(By.xpath("//span[text()='See All']")).click();
		//Thread.sleep(3000);
				
				// Perform the actions on new window
				//Thread.sleep(2000);
				
		driver.findElement(By.xpath("//span[contains(text(),'Lock Status')]")).click();
		driver.findElement(By.xpath("//span[text()='Factory Unlocked']")).click();
		Thread.sleep(5000);
			 
		driver.findElement(By.xpath("//span[text()='Condition']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Open box']")).click();
		Thread.sleep(3000);
		Thread.sleep(5000);

		driver.quit();

			}

		

	

}
