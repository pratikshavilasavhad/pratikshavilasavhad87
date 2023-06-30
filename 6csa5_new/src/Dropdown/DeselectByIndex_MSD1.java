package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByIndex_MSD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/omsai/Desktop/ABCD.html");
		WebElement country= (WebElement) driver.findElements(By.id("country"));
		Select select=new Select (country);
		select.deselectByIndex(2);

	}

}
