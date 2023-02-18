import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		System.out.println("1. Browser opened with Google search engine");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class = 'gLFyf'][@title = 'Search']")).sendKeys("facebook login");
		System.out.println("2. Searched for facebook");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class = 'gNO89b'][@value = 'Google Search']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.linkText("Log into Facebook")).click();
		driver.findElement(By.xpath("//div[@class = 'CCgQ5 vCa9Yd QfkTvb MUxGbd v0nnCb']//span")).click();
		System.out.println("3. Clicked on link for facebook login & landed on sign up page");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Already have an account?")).click();
		Thread.sleep(3000);
		System.out.println("4. Landed on sign in page");
		driver.findElement(By.xpath("//input[@id = 'email'][@class = 'inputtext _55r1 inputtext _1kbt inputtext _1kbt']")).sendKeys("amitdatir3@gmail.com");
		System.out.println("5. Entered username");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id = 'pass'] [@class = 'inputtext _55r1 inputtext _9npi inputtext _9npi']")).sendKeys("9822738608");
		System.out.println("6. Entered password");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button [@id = 'loginbutton']")).click();
		System.out.println("7. Logged into facebook profile");
		Thread.sleep(5000);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//div[@class = 'x1i10hfl x1qjc9v5 xjbqb8w xjqpnuy xa49m3k xqeqjp1 x2hbi6w x13fuv20 xu3j5b3 x1q0q8m5 x26u7qi x972fbf xcfux6l x1qhh985 xm0m39n x9f619 x1ypdohk xdl72j9 x2lah0s xe8uvvx xdj266r x11i5rnm xat24cr x1mh8g0r x2lwn1j xeuugli xexx8yu x4uap5 x18d9i69 xkhd6sd x1n2onr6 x16tdsg8 x1hl2dhg xggy1nq x1ja2u2z x1t137rt x1o1ewxj x3x9cwd x1e5q0jg x13rtm0m x1q0g3np x87ps6o x1lku1pv x1a2a7pz xzsf02u x1rg5ohu']")).click();
		System.out.println("8. Found logout button");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@data-visualcompletion = 'ignore-dynamic'] [@data-nocookies = 'true']")).click();
		Thread.sleep(2000);
		System.out.println("9. Logged out of facebook profile");
		driver.close();
	}
}
