package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import util.Hook;

public class LoginPage {
    @FindBy (how = How.ID, using = "user")
    private WebElement userInput;
    @FindBy (how = How.ID, using = "password")
    private WebElement passwordInput;
    @FindBy (how = How.ID, using = "login")
    private WebElement loginInput;

    public LoginPage () {
        PageFactory.initElements(Hook.getDiver(), this);
    }

    public LoginPage access(){
        Hook.getDiver().get("https://trello.com/login");
        return this;
    }
}
