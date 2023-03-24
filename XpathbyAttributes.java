package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;

public class XpathbyAttributes 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='Grocery']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='Mobiles & Tablets']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='TVs & Appliances']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='Flights']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		}
}
