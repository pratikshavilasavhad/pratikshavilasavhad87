package SearchContextMethods_2;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class FindElements {

		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com/");
			driver.findElement(By.tagName("div"));
			System.out.println("element size");
			System.out.println("element identified");
			
			
			
			
			
		

		}

	}

