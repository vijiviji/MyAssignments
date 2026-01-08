package week2.day1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Create_Account_Assignment {

	public static void main(String[] args) {
		
  ChromeDriver driver =new ChromeDriver();
//Set Implicit Wait for 10 seconds
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  
  driver.get("http://leaftaps.com/opentaps/");
  driver.manage().window().maximize();
	//enter username
	driver.findElement(By.id("username")).sendKeys("democsr2");
	//enter password
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	//click login
	driver.findElement(By.className("decorativeSubmit")).click();
	//Click on the "CRM/SFA" link
  driver.findElement(By.partialLinkText("CRM")).click();
//click on the "accounts" button 
  driver.findElement(By.linkText("Accounts")).click();
  //click on the "create account" button 
  driver.findElement(By.linkText("Create Account")).click();
  
  //Enter an account name
  driver.findElement(By.id("accountName")).sendKeys("test100");
  //Enter a description as "Selenium Automation Tester."
  driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
  //Enter a Number Of Employees
  driver.findElement(By.name("numberEmployees")).sendKeys("8");
  //Enter a Site Name as “LeafTaps”
  driver.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");
  //Click the "Create Account" button.
  driver.findElement(By.className("smallSubmit")).click();
    //Print theTitle name
  System.out.println(driver.getTitle());
    //Close the browser window. 
  driver.close();
  
  
  
  
  
  
	}

}
