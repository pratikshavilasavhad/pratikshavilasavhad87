package cookies_2;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookieNamed {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/");
		Cookie cooky=new Cookie("selenium","7");
		 driver.manage().addCookie(cooky);
		 driver.manage().deleteCookieNamed("selenium");
	
		
		// TODO Auto-generated method stub

	}

}
