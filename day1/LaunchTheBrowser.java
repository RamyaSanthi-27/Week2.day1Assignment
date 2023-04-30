package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchTheBrowser {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
        ChromeDriver driver=new ChromeDriver();
        //Load the url http://leaftaps.com/opentaps/control/login
        driver.get("http://leaftaps.com/opentaps/control/login");
        //Maximize the browser
       driver.manage().window().maximize();
        //Find the element username  Enter the username
       driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        //Find the element password Enter the password
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        Thread.sleep(1000);
        //Click Login button
        driver.findElement(By.className("decorativeSubmit")).click();
       //Click on CRMFA
        driver.findElement(By.partialLinkText("CRM")).click();
       // driver.findElement(By.linkText());
       // driver.findElement(By.className("CRM/SFA")).click();
        
        
        
        //Close the browser
        //driver.close();
        
	}

}
