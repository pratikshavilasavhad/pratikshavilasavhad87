package AssignmentMethod_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ASSIGNMverifyUN_PWD_isDisplayed$isEnabled {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
	    WebElement username = driver.findElement(By.name("username"));
	    WebElement password = driver.findElement(By.name("password"));
	    if(username.isDisplayed()&& username.isEnabled()) {
	    	username.sendKeys("Admin");
	    }else {
	    	System.out.println("username element is not present");
	    	
	    }
	    if(password.isDisplayed()&& password.isEnabled()) {
	    	password.sendKeys("admin");
	    	
	    }else {
	    	System.out.println("password element is not present");
	    	
	    	
	    }
	    WebElement loginBTN=driver.findElement(By.xpath("//button[@ type='submit']"));
	    loginBTN.click();
	}

}
