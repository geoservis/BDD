package page;

import com.codeborne.selenide.SelenideElement;
import data.DataHelper;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class LoginPage {
    @FindBy(css = "[data-test-id=login] input")
    private static SelenideElement loginField;
    @FindBy(css = "[data-test-id=password] input")
    private static SelenideElement passwordFiele;
    @FindBy(css = "[data-test-id=action-login]")
    private static SelenideElement loginButton;

    public VerificationPage validLogin(DataHelper.AuthInfo info) {
        loginField.setValue(info.getLogin());
        passwordFiele.setValue(info.getPassword());
        loginButton.click();
        return page(VerificationPage.class);
    }
}
