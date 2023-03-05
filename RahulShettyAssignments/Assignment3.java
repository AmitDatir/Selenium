import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		String[] phones = {"iphone X", "Samsung Note 8", "Blackberry"};
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark']) [2]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		WebElement element1 = driver.findElement(By.cssSelector("select.form-control"));
		Select s = new Select(element1);
		s.selectByValue("consult");
		driver.findElement(By.cssSelector("input[id = 'terms']")).click();
		driver.findElement(By.id("signInBtn")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[class='nav-link btn btn-primary']")));
		List<WebElement> products = driver.findElements(By.xpath("//div/h4[@class = 'card-title']"));
		List<String> phonesList = Arrays.asList(phones);
		for (int i = 0; i < products.size(); i++) {
			String name =products.get(i).getText().trim();
			if(phonesList.contains(name)) {
				driver.findElements(By.cssSelector("button.btn")).get(i).click();
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[class='nav-link btn btn-primary']")).click();
	}
}
