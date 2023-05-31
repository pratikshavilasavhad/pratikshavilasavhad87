package Manage_2;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPosition {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Point value=driver.manage().window().getPosition();
		System.out.println(value);
		
		
		// TODO Auto-generated method stub

	}

}
