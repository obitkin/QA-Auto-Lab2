package hw2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(id = "name")
    private WebElement loginField;

    @FindBy(id = "password")
    private WebElement passwdField;

    @FindBy(css = "#user-icon")
    private WebElement loginPasswdMenu;

    @FindBy(css = "#login-button")
    private WebElement loginBtn;

    @FindBy(tagName = "title")
    private WebElement title;

    @FindBy(id = "user-name")
    private WebElement name;

    /**
     * метод для ввода логина
     */
    public void inputLogin(String login) {
        loginField.sendKeys(login);
    }

    /**
     * метод для ввода пароля
     */
    public void inputPasswd(String passwd) {
        passwdField.sendKeys(passwd);
    }

    /**
     * метод для осуществления нажатия кнопки входа в аккаунт
     */
    public void clickLoginBtn() {
        loginBtn.click();
    }

    /**
     * метод для осуществления открытия меню ввода логина и пароля
     */
    public void openMenu() {
        loginPasswdMenu.click();
    }

    /**
     * метод для чтения заголовка страницы
     */
    public String getTitle() {
        return driver.getTitle();
    }

    /**
     * метод для чтения заголовка страницы
     */
    public String getName() {
        return name.getAttribute("innerText");
    }
}
