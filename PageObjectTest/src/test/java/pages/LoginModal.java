package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginModal {
    public GaragePage login(String email, String password) {
        $("#signinEmail").sendKeys("yellisseeva@gmail.com");
        $("#signinPassword").sendKeys("Jamesbond$1");
        $("[for='remember']").click();
        $x("//*[text()='login']").click();
        return new GaragePage();
    }
}
