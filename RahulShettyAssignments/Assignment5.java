import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Nested Frames")).click();
		//driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name = 'frame-top']")));
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.xpath("//div[@id = 'content']")).getText());
	}
}
