package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPageDemo extends driverClass {
	
	public loginPageDemo(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="(//INPUT[@maxlength='10'])[1]")
    private WebElement userName;

    @FindBy(xpath="(//INPUT[@maxlength='10'])[2]")
    private WebElement password;

    @FindBy(xpath="//INPUT[@name='Login']")
    private WebElement loginBtn;

    @FindBy(xpath="//LABEL[@class='css-label_remember radGroup1 radGroup2 clr'][text()='REMEMBER ME']")
    private WebElement rememberMeCheckbox;

  

    
public void enterUserNamePasswordAndLogin(String userName,String password){
    this.userName.clear();
    this.userName.sendKeys(userName);
    this.password.clear();
    this.password.sendKeys(password);
    this.loginBtn.click();
    
}
//public void ent

public void rememberMe(){
	rememberMeCheckbox.click();
}
public void login(){
	loginBtn.click();

}
			}
 


