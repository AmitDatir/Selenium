//Types of Locators:
- ID
- Name
- Class Name
- TagName
- Linked Text
- Partial Linked Text
- CSS Selector
- XPath



//<input type="text" placeholder="Username" id="inputUsername" class="submit signInBtn">

-ID:
WebElement element = driver.findElement(By.id("inputUsername"));
//Always use ID locator if present as it uniquely identifies the element.


-Name:
WebElement element = driver.findElement(By.name("inputPassword"));


-Class Name:
WebElement element = driver.findElement(By.className("submit"));           //class = "submit signInBtn" : submit and sigInBtn are two classes applicable to this element, we can use either of these two




--CSS Selector:
Class Name: tagName.className OR .className    //input.submit              //if we use .className, make sure className is unique
    ID    : tagName#id                         //input#inputUsername
  General : tagName[attribute = 'value']       //input[placeholder = 'Username']
