package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement uName;
	
	@FindAll({ //Uses AND condition,so it has to find by id and name.
		@FindBy(id="password"),
		@FindBy(name="password")
	})
	private WebElement pwd;
	
	@FindAll({ //Uses OR condition, so it will find by id or name or type.
		@FindBy(id="login"),
		@FindBy(name="login"),
		@FindBy(className="button")
	})
	private WebElement lbtn;
	
	public void enterUsername(String user)
	{
		uName.sendKeys(user);
	}
	
	public void enterPassword(String p)
	{
		pwd.sendKeys(p);
	}
	
	public void clickLoginButton()
	{
		lbtn.click();
	}

}
