package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LanchBrowser {
	public static void main(String[] args) {
		//Launch the browser
        ChromeDriver driver=new ChromeDriver();
        //Load the url
        driver.get("http://www.leafground.com/input.xhtml");
        //Maximize the browser
     driver.manage().window().maximize();
       //Type your name
     driver.findElement(By.id("j_idt88:name")).sendKeys("Ramya Shanthi");
   
	}

}
