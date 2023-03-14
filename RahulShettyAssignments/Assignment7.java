import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.xpath("//input[@id = 'autocomplete']")).sendKeys("Uni");
		Thread.sleep(2000);
//		for(int i=0;i<4;i++) {
		driver.findElement(By.xpath("//input[@id = 'autocomplete']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//input[@id = 'autocomplete']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//input[@id = 'autocomplete']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//input[@id = 'autocomplete']")).sendKeys(Keys.DOWN);
//		i++;
//		Thread.sleep(2000);
//		}
		System.out.println(driver.findElement(By.xpath("//input[@id = 'autocomplete']")).getAttribute("value"));
	}
}
