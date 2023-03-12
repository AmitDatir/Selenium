import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.xpath("//div[@id = 'checkbox-example']//fieldset//label[1]//input[@id = 'checkBoxOption1']")).click();
		String chkBox = driver.findElement(By.xpath("//div[@id = 'checkbox-example']//fieldset//label[1]")).getText();
		System.out.println(chkBox);
		WebElement dropDown = driver.findElement(By.xpath("//Select[@id = 'dropdown-class-example']"));
		Select dd = new Select(dropDown);
		dd.selectByVisibleText(chkBox);
		driver.findElement(By.xpath("//input[@id = 'name'][@name = 'enter-name']")).sendKeys(chkBox);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id = 'alertbtn'][@value = 'Alert']")).click();
		String alert = driver.switchTo().alert().getText();
		if(alert.contains(chkBox)) {
			System.out.println("Correct alert message displayed.");
		} else {
			System.out.println("Test for displaying alert message failed");
		}
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
}
