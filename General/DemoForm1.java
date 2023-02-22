/*
Basic script for demo form: http://rahulshettyacademy.com/angularpractice/
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoForm1 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://rahulshettyacademy.com/angularpractice/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name = 'name'])[1]")).sendKeys("ABCD");
		driver.findElement(By.name("email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("abcd@gmail.com");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select test = new Select(dropdown);
		test.selectByIndex(1);
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("01/01/1990");
		driver.findElement(By.xpath("//input[@value= 'Submit']")).click();
		System.out.println("Success message displayed: " + driver.findElement(By.xpath("//div[@class= 'alert alert-success alert-dismissible']")).getText());
		Thread.sleep(5000);
		driver.close();
	}
}
