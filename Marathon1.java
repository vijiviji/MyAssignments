package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Marathon1 {

	//private static WebElement WebElement d ;

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		//Set Implicit Wait for 10 seconds
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  driver.get("https://www.pvrcinemas.com/");
		  driver.manage().window().maximize();
		  //Thread.sleep(2000);
		  //driver.findElement(By.className("//input[@class='p-inputtext p-component p-autocomplete-input p-autocomplete-input']"));
		  //driver.findElement(By.xpath("//h6[text()='Chennai']")).click();

		  //driver.findElement(By.xpath("//h6[text()='Chennai']")).click();
		  //driver.findElement(By.id("username")).sendKeys("democsr2");
		  driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		  
		  driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		 
		  driver.findElement(By.xpath("//span[text()='INOX Nexus Whitefield Bengaluru']")).click();
		  
		  driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
		  
		  driver.findElement(By.xpath("(//span[text()='MARK'])[2]")).click();
		  
		  driver.findElement(By.xpath("(//span[text()='Kannada'])[7]")).click();
		  
		  driver.findElement(By.xpath("(//span[text()='Book'])[4]")).click();
		  
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[text()='Accept']")).click();
		  Thread.sleep(1000);
		  //seat selection
		  driver.findElement(By.xpath("//span[text()='4']")).click();
		  Thread.sleep(1000);
		  //proceed button click
		  driver.findElement(By.xpath("//div[@class='register-btn']")).click();
		  Thread.sleep(1000);
		  
		  //Print the Seat info under book summary
		  WebElement d  = driver.findElement(By.xpath("//div[@class='select-seat-number']"));
		 String e=d.getText();
		 System.out.println("Seat Info " +e);
		  Thread.sleep(1000);
		  
		 //Print the grand total under book summary
		 // WebElement d1  = driver.findElement(By.xpath("//div[@class='grand-amount']"));
		  WebElement d1  = driver.findElement(By.xpath("//div[@class='grand-prices']"));
		  String e1=d1.getText();
			 //System.out.println(e1);
			  Thread.sleep(1000);
			  System.out.println("Grand Total " + e1);
			  
			  
		  //close icon
		  driver.findElement(By.xpath("//img[@alt='close']")).click();
		  Thread.sleep(1000);
		  System.out.println(driver.getTitle());
		  Thread.sleep(1000);
		 driver.close();
		
		
		

	}

}
