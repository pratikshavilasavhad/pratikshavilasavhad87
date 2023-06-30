package FindElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForEach {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement>allRadioButton = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(allRadioButton.size());
		for(WebElement singleRadioButton:allRadioButton)
			singleRadioButton.click();
		

	}

}
