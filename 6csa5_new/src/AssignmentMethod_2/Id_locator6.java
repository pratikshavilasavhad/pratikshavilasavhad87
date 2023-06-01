package AssignmentMethod_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_locator6 {

	public static void main(String[] args) {
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.com/");
			driver.findElement(By.id("b"));
			System.out.println("element 1 identified");
			
			driver.get("https://www.myntra.com/");
			driver.findElement(By.id("b"));
			System.out.println("element 2 identified");
			
			
			driver.get("https://www.swiggy.com/");
			driver.findElement(By.id("b"));
			System.out.println("element 3 identified");
			
			driver.get("https://www.eseva.com/");
			driver.findElement(By.id("b"));
			System.out.println("element 4 identified");
			
			
			driver.get("https://www.fb.com/");
			driver.findElement(By.id("b"));
			System.out.println("element 5 identified");
			
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.id("b"));
			System.out.println("element 6 identified");
			
			driver.get("https://www.google.com/");
			driver.findElement(By.id("b"));
			System.out.println("element 7 identified");
			
			driver.get("https://www.actitime.com/");
			driver.findElement(By.id("b"));
			System.out.println("element 8 identified");
			
			driver.get("https://www.zomato.com/");
			driver.findElement(By.id("b"));
			System.out.println("element 9 identified");
			
			driver.get("https://www.netflix.com/");
			driver.findElement(By.id("b"));
			System.out.println("element 10 identified");
			
			
			
			
			

		}



		// TODO Auto-generated method stub


	

		// TODO Auto-generated method stub

	}

}
