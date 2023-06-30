package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue_SSD {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/omsai/Desktop/ABCD.html");
		WebElement country= (WebElement) driver.findElements(By.id("country"));
		Select select=new Select (country);
		Thread.sleep(3000);
		select.selectByIndex(2);
		Thread.sleep(3000);
		select.selectByIndex(4);
	}

}
