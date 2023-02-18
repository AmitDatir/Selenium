import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonLogin {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("1. Browser opened with Google search engine");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class = 'gLFyf'][@title = 'Search']")).sendKeys("amazon india login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class = 'gNO89b'][@value = 'Google Search']")).click();
		System.out.println("2. Searched for amazon india login page");
		driver.findElement(By.xpath("//h3[@class = 'LC20lb MBeuO DKV0Md']")).click();
		Thread.sleep(3000);
		System.out.println("3. Clicked on link for amazon india login");
		WebElement element  = driver.findElement(By.xpath("//div[@class='nav-line-1-container']//span"));
		element.click();
		System.out.println("4. Login page displayed");
		Thread.sleep(3000);;
		driver.findElement(By.xpath("//input[@id = 'ap_email'][@name = 'email']")).sendKeys("email");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id = 'continue'][@type = 'submit']")).click();
		System.out.println("5. Entered username");
		driver.findElement(By.xpath("//input[@id = 'ap_password'][@name = 'password']")).sendKeys("password");
		Thread.sleep(3000);
		System.out.println("6. Entered password");
		driver.findElement(By.xpath("//input[@id = 'signInSubmit'][@type = 'submit']")).click();
		Thread.sleep(3000);
		System.out.println("7. Logged into the Amazon India website");
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//div[@class='nav-line-1-container']//span"))).perform();
		Thread.sleep(2000);
		System.out.println("8. Mouseover complete to find logout button");
		driver.findElement(By.xpath("//a[@id = 'nav-item-signout']//span")).click();
		Thread.sleep(3000);
		System.out.println("9. Logged out of Amazon India website");
		driver.close();
	}
}
