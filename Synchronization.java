//Thread.sleep() (To Be Avoided)


//Implicit Wait:
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
// Applies automatically to all subsequent findElement calls
driver.findElement(By.id("username")).sendKeys("admin");


//Explicit Wait:
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); //or (driver, 10);
WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("submit-btn")));
element.click();



//Fluent Wait:
Wait<WebDriver> wait = new FluentWait<>(driver)
    .withTimeout(Duration.ofSeconds(30))
    .pollingEvery(Duration.ofSeconds(2))
    .ignoring(NoSuchElementException.class);

WebElement element = wait.until(driver -> driver.findElement(By.id("dynamic-ajax-element")));
