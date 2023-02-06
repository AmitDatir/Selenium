import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		System.out.println("Browser opened with Google search engine");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class = 'gLFyf'][@title = 'Search']")).sendKeys("amazon india login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class = 'gNO89b'][@value = 'Google Search']")).click();
		driver.findElement(By.xpath("//h3[@class = 'LC20lb MBeuO DKV0Md']")).click();
		Thread.sleep(3000);
		//driver.switchTo().frame(-1);
		//((WebElement) driver.findElements(By.xpath("//a[@class='nav-a nav-a-2   nav-progressive-attribute'][@id='nav-link-accountList']"))).click();
		((WebElement) driver.findElements(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"))).click();
		//((WebElement) driver.findElements(By.linkText("Hello, sign in"))).click();
		System.out.println("Login page displayed");
		Thread.sleep(3000);;
		driver.findElement(By.xpath("//input[@id = 'ap_email'][@name = 'email']")).sendKeys("amitdatir3@gmail.com");
		Thread.sleep(3000);
		((WebElement) driver.findElements(By.xpath("//input[@id = 'continue'] [type = 'submit']"))).click();
		driver.findElement(By.xpath("//input[@id = 'ap_password'][@name = 'password']")).sendKeys("Amit@9822");
		Thread.sleep(3000);
		((WebElement) driver.findElements(By.xpath("//input[@id = 'signInSubmit'] [type = 'submit']"))).click();
		Thread.sleep(3000);
		System.out.println("Logged into the Amazon India website");
		driver.close();
	}
}
