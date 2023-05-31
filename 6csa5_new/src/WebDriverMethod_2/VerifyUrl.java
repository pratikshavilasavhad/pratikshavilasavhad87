package WebDriverMethod_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrl {


		public static void main(String[] args) {
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");
			String actualTitle=driver.getTitle();
			String expectedTitle="actitime-login";
			if(actualTitle.equals(expectedTitle))
				System.out.println("PASS");
			else
				System.out.println("FAIL");
		// TODO Auto-generated method stub

	}

}
