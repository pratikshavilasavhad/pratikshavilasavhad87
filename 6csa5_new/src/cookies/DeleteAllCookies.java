package cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteAllCookies {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fb.com/");
		Cookie cooky=new Cookie("selenium","7");
		 driver.manage().addCookie(cooky);
		 driver.manage().deleteAllCookies();
	
	
		// TODO Auto-generated method stub

	}

}
