package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateContacs {

	public static void main(String[] args) {
//1.Open the browser
		 ChromeDriver driver=new ChromeDriver();
//2.Load the URL:http://leaftaps.com/opentaps/control/login
		 driver.get("http://leaftaps.com/opentaps/control/login");
//3.Maximize the browser
		 driver.manage().window().maximize();
//4.Enter UserName
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
//5.Enter Password
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
//6.Click Login
		 driver.findElement(By.className("decorativeSubmit")).click();
//7.Click CRM/SFA
		 driver.findElement(By.linkText("CRM/SFA")).click();
//8.Click Contacts Tab
		 driver.findElement(By.linkText("Contacts")).click();
//9.Click Create Contact
		 driver.findElement(By.partialLinkText("Create Contact")).click();
//10.Type First Name
		 driver.findElement(By.id("firstNameField")).sendKeys("Nirudra");
//11.Type Last Name
		 driver.findElement(By.id("lastNameField")).sendKeys("Santhosh");
//12.Click Create Contact Button
		 driver.findElement(By.name("submitButton")).click();
//13.Print the first name and browser title 
		String FirstName = driver.findElement(By.id("viewContact_fullName_sp")).getText();
		    System.out.println(FirstName);
		String title = driver.getTitle();  //Ctrl+2
			System.out.println(title);
//14.Close the browser
			driver.close();
	}

}
