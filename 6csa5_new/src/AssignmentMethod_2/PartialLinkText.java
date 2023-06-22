package AssignmentMethod_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.partialLinkText("Mobiles"));
		System.out.println("element 1 identified");
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.partialLinkText("Forgotten account?"));
		System.out.println("element 2 identified");
		
		
		driver.get("https://www.zomato.com/india");
		driver.findElement(By.partialLinkText("Terms of Service"));
		System.out.println("element 3 identified");
		
		
		driver.get("https://www.swiggy.com/");
		driver.findElement(By.partialLinkText("Privacy Policy"));
		System.out.println("element 4 identified");
		
		
		driver.get("https://www.google.com/");
		driver.findElement(By.partialLinkText("Google apps"));
		System.out.println("element 5 identified");
		
		
		driver.get("https://in.meesho.com/");
		driver.findElement(By.partialLinkText("Jewellery & Accessories"));
		System.out.println("element 6 identified");
		
		
		driver.get("https://in.linkedin.com/");
		driver.findElement(By.partialLinkText("Continue with Google"));
		System.out.println("element 7 identified");
		
		
		driver.get("https://pizzaonline.dominos.co.in/");
		driver.findElement(By.partialLinkText("All Rights Reserved. Copyright © Jubilant FoodWorks Ltd."));
		System.out.println("element 8 identified");
		
		driver.get("https://www.netflix.com/in/login");
		driver.findElement(By.partialLinkText("This page is protected by Google reCAPTCHA to ensure you're not a bot."));
		System.out.println("element 8 identified");
		
		
		driver.get("https://www.naukri.com/");
		driver.findElement(By.partialLinkText("Recruiters will call you on this number"));
		System.out.println("element 9 identified");
		

		driver.get("");
		driver.findElement(By.partialLinkText("Recruiters will call you on this number"));
		System.out.println("element 10 identified");
		



		






		}

}
