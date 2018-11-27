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
    private WebElement loginButton;

    @FindBy (how = How.XPATH, using = "//a[@aria-label='Página Inicial do Trello']")
    private WebElement initialPage;

    public LoginPage () {
        PageFactory.initElements(Hook.getDiver(), this);
    }

    public LoginPage access(){
        Hook.getDiver().get("https://trello.com/login");
        return this;
    }

    public LoginPage doLoguin(String user, String password) {
        userInput.sendKeys(user);
        passwordInput.sendKeys(password);
        loginButton.click();
        return this;

    }

    public String checkInitialPage(){
        return initialPage.getAttribute("aria-label");
    }
}
