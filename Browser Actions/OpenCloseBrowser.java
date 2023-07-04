import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String args[]) throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser opened successfully.");
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.close();
		System.out.println("Browser closed successfully");
	}
}
