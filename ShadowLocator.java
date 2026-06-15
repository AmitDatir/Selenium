import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public WebElement getShadowElement(WebDriver driver, String hostSelector, String targetSelector) {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    
    // 1. Locate the Shadow Host
    WebElement host = driver.findElement(By.cssSelector(hostSelector));
    
    // 2. Use JS to expand the shadow root and find the child element
    // Note: We use return arguments[0].shadowRoot.querySelector(...)
    return (WebElement) js.executeScript(
        "return arguments[0].shadowRoot.querySelector('" + targetSelector + "');", 
        host
    );
}
