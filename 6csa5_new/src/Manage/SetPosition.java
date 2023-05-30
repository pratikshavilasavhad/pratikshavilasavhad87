package Manage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Point;

public class SetPosition {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Point p=new Point(600000,110000);
		driver.manage().window().setPosition(p);
		System.out.println(driver.manage().window().getPosition());
		// TODO Auto-generated method stub

	}

}
