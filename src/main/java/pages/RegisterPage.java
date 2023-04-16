package pages;

import lib.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class RegisterPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private BasePage basePage;

    private By nameField = By.xpath(Constants.INPUT_NAME);
    private By emailField = By.xpath(Constants.INPUT_EMAIL);
    private By passwordField = By.xpath(Constants.INPUT_PASSWORD);
    private By registerButton = By.xpath(Constants.REGISTER_BUTTON);
    private By invalidPasswordWarning = By.xpath(Constants.INVALID_PASSWORD_WARNING);
    private By loginLink = By.xpath(Constants.LOGIN_PAGE_LINK);

    public RegisterPage (WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        basePage = new BasePage(driver);
    }

    public void inputName(String password) {
        basePage.writeText(nameField, password);
    }

    public void inputEmail(String email) {
        basePage.writeText(emailField, email);
    }

    public void inputPassword(String password) {
        basePage.writeText(passwordField, password);
    }

    public void clickRegister() {
        basePage.click(registerButton);
    }

    public void clickLoginLink() {
        basePage.click(loginLink);
    }

    public void validatePasswordWarning() {
        String expectedText = "Некорректный пароль";
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions
                .textToBePresentInElementLocated(invalidPasswordWarning, expectedText));
    }
}

