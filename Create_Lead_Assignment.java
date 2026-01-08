	package week2.day1;
	
	import java.time.Duration;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class Create_Lead_Assignment {
	
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
			  //clicking on lead tab
			    driver.findElement(By.linkText("Leads")).click();
				//clicking on create lead side menu
			    driver.findElement(By.linkText("Create Lead")).click();
			    //Enter a FirstName
			    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("viji");
			    //Enter a LastName
			    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("guna");
			    //Enter a CompanyName
			    driver.findElement(By.name("companyName")).sendKeys("FNF");
			    //Enter a Title 
			    driver.findElement(By.name("generalProfTitle")).sendKeys("title is");
			    //click on the "Create Lead"
			    driver.findElement(By.name("submitButton")).click();
			    System.out.println(driver.getTitle());
			    driver.close();
				
				
		}
	
	}
