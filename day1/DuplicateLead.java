package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
	                // 1. Launch URL "http://leaftaps.com/opentaps/control/login"
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();
			        // 2. Enter UserName and Password Using Id Locator
	                // username: demosalesManager
	                // password : crmsfa
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			       // 3. Click on Login Button using Class Locator
			driver.findElement(By.className("decorativeSubmit")).click();			
			       // 4. Click on CRM/SFA Link
			driver.findElement(By.linkText("CRM/SFA")).click();
			       // 5. Click on Leads Button
			driver.findElement(By.linkText("Leads")).click();
			       // 6. Click on Create Lead 
			driver.findElement(By.partialLinkText("Create")).click();
			       // 7. Enter CompanyName Field Using id Locator
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
			       // 8. Enter FirstName Field Using id Locator
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramya");
			       // 9. Enter LastName Field Using id Locator
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Shanthi");
			      // 10. Enter FirstName(Local) Field Using id Locator
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ramya");
			      // 11. Enter Department Field Using any Locator of Your Choice
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
			       //12. Enter Description Field Using any Locator of your choice 
			driver.findElement(By.id("createLeadForm_description")).sendKeys("NonIT-IT AprlO1 2023");
			      // 13. Enter your email in the E-mail address Field using the locator of your choice
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ramyashanthi@gmail.com");
			      // 14. Click on Create Button
			driver.findElement(By.name("submitButton")).click();
	               //15. Get the Title of Resulting Page. 			
			String title = driver.getTitle();  //Ctrl+2
			System.out.println(title);
	        		//16. Click on Duplicate button
			driver.findElement(By.linkText("Duplicate Lead")).click();
                  //17. Clear the CompanyName Field using .clear() 
			driver.findElement(By.id("createLeadForm_companyName")).clear();
			      //And Enter new CompanyName
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("EdTech");
                  //18.Clear the FirstName Field using .clear()
			driver.findElement(By.id("createLeadForm_firstName")).clear();
			      //And Enter new FirstName
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("P.Ramya");
                  //19.Click on Create Lead Button
			driver.findElement(By.name("submitButton")).click();
                  //20. Get the Title of Resulting Page using driver.getTitle()
			String title1 = driver.getTitle();  //Ctrl+2
			System.out.println(title1);


	}

}
