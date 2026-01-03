package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Marathon2 {

	public static void main(String[] args) throws InterruptedException {
		
			ChromeDriver driver =new ChromeDriver();
			//Set Implicit Wait for 10 seconds
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			  
			  driver.get("https://www.amazon.in");
			  driver.manage().window().maximize();
			  
			  //search menu
			  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys", Keys.ENTER);

			  String fullText = driver.findElement(By.xpath("//h2[contains(@class,'a-size-base')]")).getText();
			  System.out.println(fullText);
              
			  Thread.sleep(1000);
			  
			  //select newest arrival from filter - drop down (select tag)
			  ////i[@class='a-icon a-icon-checkbox']---old xpath			 
		  driver.findElement(By.xpath("(//div[@id='brandsRefinements']//i[@class='a-icon a-icon-checkbox'])[1]")).click();  Thread.sleep(2000);
		  System.out.println("first checkbox selected");
			  
			  driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[2]")).click();Thread.sleep(2000);
			  System.out.println("second checkbox selected");

			  // 07) Choose New Arrivals (Sort)
		        WebElement sortDropdown = driver.findElement(By.id("s-result-sort-select"));
		        Select sort = new Select(sortDropdown);
		        sort.selectByVisibleText("Newest Arrivals"); Thread.sleep(2000);
		        
		        WebElement element=driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base']"));
		        WebElement element1= driver.findElement(By.xpath("//span[@class='a-price-whole']"));
		        
		        System.out.println("First Bag Name: " + element.getText());
		        System.out.println("Discounted Price: ₹" + element1.getText());
			  
			  

		     // 09) Get page title and close browser
		        System.out.println("Page Title: " + driver.getTitle());

		    //  10 - browser close
		        driver.close();			 		  
	}

}
