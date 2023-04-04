package week2.HomeAsign;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingSeleniumAutoLeadCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initializing obj for browser
		ChromeDriver driver=new ChromeDriver();
		//launch browser
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HCL");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sathak");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sardhar");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sathak.222@yopmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("878987");
		driver.findElement(By.name("submitButton")).click();
		
		
		/* Enter CompanyName using id Locator
		 
		 * 8. Enter FirstName using id Locator
		 * 9. Enter LastName using id Locator
		 * 10. Enter your mail-id
	   * 11.phone number 
		 * 12. Click on create Lead Button Using name Locator
		 */
		
		
			
	}

}
