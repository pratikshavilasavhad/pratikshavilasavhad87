package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\omsai\\Desktop\\Pratiksha Updated Resume 05.03.2023");
	    WebElement textbox=	driver.findElement(By.xpath("//input[@value"));
		 textbox.clear();
		 textbox.sendKeys("hello");
		


	}

}
