package JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBy {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actimind.com/");
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("00.scrollBy(o,500)");

	}

}
