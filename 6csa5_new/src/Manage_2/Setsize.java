package Manage_2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setsize {

	public static void main(String[] args) {
		
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/login/");
        	Dimension d=new Dimension(550,550);
			driver.manage().window().setSize(d);
			
		// TODO Auto-generated method stub

	}

}
