import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
    
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.xpath("//div//a[@href = '/windows/new']")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> id = windows.iterator();
		String parent = id.next();
		String child = id.next();
		driver.switchTo().window(child);
		System.out.println(driver.findElement(By.xpath("//div//h3")).getText());
		driver.switchTo().window(parent);
		System.out.println(driver.findElement(By.xpath("//div//div//h3")).getText());
	}
}
