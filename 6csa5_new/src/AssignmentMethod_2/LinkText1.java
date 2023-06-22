package AssignmentMethod_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.linkText("Mobiles"));
		System.out.println("element identified");
		driver.close();
		
		
		driver.get("https://www.flipkart.in/");
		driver.findElement(By.linkText("mobiles"));
		System.out.println("element2 identified");
		
		

	}




	}


