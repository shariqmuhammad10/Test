package Tests;

import Steps.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;





@RunWith(SerenityRunner.class)
public class LoginTest {

    @Steps
    LoginSteps loginSteps;



        @Managed(driver = "chrome")
        WebDriver driver;

    @Test
    public void addingSums() {

        System.out.println("first Test , Yahoo");

    }
}








