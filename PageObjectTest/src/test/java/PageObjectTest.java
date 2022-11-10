import com.codeborne.selenide.Condition;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import pages.BasePage;
import pages.GaragePage;
import pages.HomePage;
import pages.LoginModal;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.files.DownloadActions.click;

public class PageObjectTest {

    @Test
    public void canLogin() {
        BasePage basePage = new BasePage();
        basePage.header.openLoginModal();

        HomePage homePage = new HomePage();
        homePage.name = "home";
        homePage.test = "test";

        WebDriverManager.chromedriver().setup();

      open("https://qauto.forstudy.space/","",  "guest" , "welcome2qauto");
        HomePage homePage = new HomePage();
        homePage.header.openLoginModal();

        LoginModal loginModal = new LoginModal();
        loginModal.login("yellisseeva@gmail.com" , "Jamesbond$1");

        //Act
        GaragePage garagePage = homePage.login("yellisseeva@gmail.com", "Jamesbond$1");

        //Assert
        garagePage.notifications.shouldHaveText("You have been successfully logged in");
    }

    @Test
    public void canAddCar() {
        WebDriverManager.chromedriver().setup();
        open("https://qauto.forstudy.space/","",  "guest" , "welcome2qauto");

        HomePage homePage = new HomePage();
        LoginModal loginModal = homePage.header.openLoginModal();

        loginModal.login("yellisseeva@gmail.com", "Jamesbond$1");

        //Act
        garagePage.addCar("BMW", "X5", 1.2)
                .addCar("BMW", "X5", 1.2)
                .addCar("BMW", "X5", 1.2);

        //Assert
        garagePage.notifications.shouldHaveText("Car added");


        //canLogoutViaSideMenu
    }
}
