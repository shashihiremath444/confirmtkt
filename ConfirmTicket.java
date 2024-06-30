package confirmtkt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ConfirmTicket {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.confirmtkt.com/rbooking-d/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Click on Login 
		driver.findElement(By.xpath("//span[text()=\"LOGIN\"]")).click();
		//Enter mobile no and and OTP within 30 seconds
		Thread.sleep(30000);
		
		//click and select destination at From
		 driver.findElement(By.xpath("//label[text()=\"From\"]")).click();
		 driver.findElement(By.xpath("//a[text()=\"SBC  - Bangalore City Junction\"]")).click();
		 
		//click and select destination at To
		 driver.findElement(By.xpath("//label[text()=\"To\"]")).click();
		 driver.findElement(By.xpath("//a[text()=\"MMCT  - Mumbai Central\"]")).click();
		
		 
		 driver.findElement(By.xpath("//span[text()=\"SEARCH\"]")).click();
		 Thread.sleep(2000);
		 
		 //Scroll down for element visible at window
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0, 1000);");
	      
		 driver.findElement(By.xpath("//div[contains(@class, 'train-block')][.//div[contains(text(), '11302 -') and contains(text(), 'udyan exp')]]/following-sibling::div[@style='padding-bottom: 50px;']//div[@class='availability-cache']//div[@class='avail-block']//div[@class='avail-cls' ]//span[text()='3A']")).click();
		 
		 driver.findElement(By.xpath("//*[@id=\"3A\"]/div[1]/div/div[3]/div")).click();
		 Thread.sleep(10000);
		 
		 //enter IRCTC ID manually
		 
		 driver.findElement(By.xpath("//span[text()=\"Male\"]")).click();
		 
		 //add the name and age of the passenger
		 driver.findElement(By.id("passengerName")).sendKeys("Shashidhar");
		 driver.findElement(By.id("passengerAge")).sendKeys("24");
		 
		 
		 //select the text from the drop down using select()
		 Select ddown = new Select(driver.findElement(By.id("berth-pref")));
		 ddown.selectByVisibleText("Lower Berth");
		 
		 driver.findElement(By.xpath("//span[text()=\"Save\"]")).click();
		 //once you enter the mailID that one will be saved for particular mobile number
		 driver.findElement(By.id("email")).sendKeys("shashihiremath444@gmail.com");
		 driver.findElement(By.xpath("//div[text()=\"Pay no charges when ticket is cancelled\"]")).click();
		 driver.findElement(By.xpath("//div[text()=\"PROCEED\"]")).click();
		
		
	}

}
