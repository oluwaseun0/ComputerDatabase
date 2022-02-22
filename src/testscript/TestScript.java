package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class TestScript {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\ComputerDatabase\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//open application url
		driver.get("https://computer-database.herokuapp.com/computers");
		//to maximize browser
		driver.manage().window().maximize();
		//to wait for the site to fully load
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	
		//to test add functionality
		//to click on add a new computer
		driver.findElement(By.xpath("/html/body/section/div[1]/a")).click();
		//enter computer name
		driver.findElement(By.id("name")).click();
		driver.findElement(By.id("name")).sendKeys("Dellc");
		//enter introduced date
		driver.findElement(By.id("introduced")).click();
		driver.findElement(By.id("introduced")).sendKeys("1995-04-19");
		//enter discontinued date
		driver.findElement(By.id("discontinued")).click();
		driver.findElement(By.id("discontinued")).sendKeys("2009-04-19");
		//select Company
		Select dropdown = new Select(driver.findElement(By.id("company")));  
		dropdown.selectByVisibleText("Canon"); 
		
		//to test create functionality
		//to click on create computer
		driver.findElement(By.xpath("//*[@id=\"main\"]/form/div/input")).click();
		
		 //to test pagination functionality
		//to click on next
		driver.findElement(By.xpath("//*[@id=\"pagination\"]/ul/li[3]/a")).click();
		//to click on previous
		driver.findElement(By.xpath("//*[@id=\"pagination\"]/ul/li[1]/a")).click();
		
		
		//to test filter functionality
		//to enter computer name into the filter
		driver.findElement(By.id("searchbox")).click();
		driver.findElement(By.id("searchbox")).sendKeys("Dellc");
		//to click on filter 
		driver.findElement(By.xpath("//*[@id=\"searchsubmit\"]")).click();
		
	 
		
	
	
	}
	}
	
	
	
