package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRect {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	    WebElement username = driver.findElement(By.id("email"));
	    System.out.println(username.getRect().x);
	    System.out.println(username.getRect().y);
	    System.out.println(username.getRect().width);
	    System.out.println(username.getRect().height);
		   
	    
        	


	}

}
