//Types of Locators:
- ID
- Name
- Class Name
- TagName
- Linked Text
- Partial Linked Text
- CSS Selector
- XPath



/*
    <form action ="#">
        <h2> .... </h2>
        <input type="text" placeholder="Username" id="inputUsername" class="submit signInBtn">
        <input type="text" placeholder="Email">
        <input type="text" placeholder="Phone Number">
        <input type="password" placeholder="password">
        <br>
        <div class = "forgot-pwd-btn-container">....</div>
    </form>
*/

-ID:
WebElement element = driver.findElement(By.id("inputUsername"));
//Always use ID locator if present as it uniquely identifies the element.



-Name:
WebElement element = driver.findElement(By.name("inputPassword"));



-Class Name:
WebElement element = driver.findElement(By.className("submit"));           //class = "submit signInBtn" : submit and sigInBtn are two classes applicable to this element, we can use either of these two  -->whenever we write customized locators like css or xpath, give complete class name 



-Tag Name:
WebElement element = driver.findElement(By.tagName("placeholder"));              //tagname should be uniue



//<a href="#">Forgot your password</a>
-Linked Text:
WebElement element = driver.findElement(By.linkedText("Forgot your password"));     



-Partial Linked Text:
WebElement element = driver.findElement(By.partialLinkedText("Forgot")); 



--CSS Selector:
Class Name: tagName.className OR .className    //input.submit              //if we use .className, make sure className is unique
    ID    : tagName#id        OR .id           //input#inputUsername
  General : tagName[attribute = 'value']       //input[placeholder = 'Username']
    
//to check element using console : 
$('css locator')

//how to handle case of multiple elements with same attribute values
input[type = 'text']:nth-child(2)                    //2 is the index of the desired locator

//Parent-child traverse:                        
parentTag childTag             :             form h2

//incomplete attribute value:
input[type *= 'pass']        //complete value: password
tagname                      //using only unique tagname also works for css

    
--XPath:
tagName[@attribute1 = 'value1'][@attribute2 = 'value2']                  //  //input[@placeholder = 'Username']

Absolete xpath:
/html/tagname/tagname                //absolete xpath always starts with single / & from root node that is html tag
Relative xpath:
//tagname/tagname                    //relative xpath starts from any relative location and it always starts with //

//to check element using console : 
$x('css locator')

//how to handle case of multiple elements with same attribute values
    //input[@type = 'text'][2]                    //2 is the index of the desired locator

//incomplete attribute value:
    //input[contains(@text,'pass')]        //complete value: password
    //tagname                              //using only unique tagname also works for xpath

//Parent-child traverse:                        // :- search within entire page   / :- search within stated parent tag only
    //parentTag/childTag                                   :            //form/h2
    //parentTag/childTag[index]                            :            //form/input[2]
    //parentTag[@attribute = 'value']/childTag[index]      :            //div[@class = 'forgot-pwd-btn-container']/button[2]
    //parentXpath //childXpath                             :            //div[@id = 'sncks_sxinc_scjbc'] //a[@value = 'MAA']

//Sibling traverse:
    //parentTag/childTag/following-sibling::siblingTagName[index]                       //header/div/button[1]/following-sibling::button[1]

//child to parent travrse:
    //parentTag/childTag/childTag/parent::parentTagName                                //header/div/button[1]/parent::div

//Xpath using locator text:
    //tagname[text() = 'locator text']                   //button[text() = 'Log Out']
