package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

@Component
public class LoginPage {
	WebDriver driver;
	@FindBy(id="j_username")
	private WebElement userName;
	@FindBy(id="j_password")
	private WebElement userPassword;
	@FindBy(id="logOnFormSubmit")
	private WebElement login;
	@FindBy(id="__jsview0--shell-title")
	private WebElement launchpadLabel;
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
		//This initElements method will create  all WebElements
		PageFactory.initElements(driver, this);
	}
	
	//输入登陆用户名
	public void setUserName(String name) {
		userName.sendKeys(name);
	}
	
	//输入登陆密码
	public void setPassWord(String passWorld) {
		userPassword.sendKeys(passWorld);
	}
	
	//点击登陆按钮
	public void clickLoginButton() {
		login.click();
	}
	
	public String launchpadLabelDisplay() {
		return launchpadLabel.getText();
	}
}
