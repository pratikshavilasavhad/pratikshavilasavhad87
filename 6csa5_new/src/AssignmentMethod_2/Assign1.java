package AssignmentMethod_2;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Assign1 {

	public static void main(String[] args) {
		System.out.println("enter value to open browser:1-Chrome Browser,Edge Browser");
		Scanner sc=new Scanner(System.in);
		int value=sc.nextInt();
		
		switch(value) {
		case 1:{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			break;
			
		}
		case 2:{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			break;
		}
			
		}
		// TODO Auto-generated method stub

	}

}
