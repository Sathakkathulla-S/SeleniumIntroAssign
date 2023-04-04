package week2.HomeAsign;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingSeleniumAutoEditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 
		Credential:
			Username:DemoCsr
			Password:crmsfa
 * http://leaftaps.com/opentaps/control/main
	
	* 1	Launch the browser
	* 2	Enter the username
	* 3	Enter the password
	* 4	Click Login
	* 5	Click crm/sfa link
	* 6	Click Leads link
	* 7	Click on Create Lead
*8 Enter company name
*9 Enter first name
*10 Enter last name
*11click on Create Lead button  
	* 12 Click Edit button 
	* 13 Change the company name
	* 14 Click Update*/
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Vaeto");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saravana");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("ramasamy");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Infosys");
		driver.findElement(By.name("submitButton")).click();
		
		
	}

}
