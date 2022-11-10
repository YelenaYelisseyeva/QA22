package pages;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class Header {

    WebElement signIn = $(".header_signin");
    WebElement guestLogin = $(".-guest");
//...

public void openLoginModal() {
    signIn.click();
    return new LoginModal();
}
}