package Object;

import BaseClass.BaseSetUp;
import org.openqa.selenium.By;


public class Login extends BaseSetUp {

    private final By fieldEmailIsDisplayed = new By.ByName("email");
    public void inputEmailIsDisplayed() {
        isDisplayed(fieldEmailIsDisplayed);
    }

    private final By fieldEmail = new By.ByName("email");
    public void inputEmail(String email) {
        inputText(fieldEmail, email);
    }

    private final By fieldPassword = new By.ByName("password");
    public void inputPassword(String password) {
        inputText(fieldPassword, password);
    }

    private final By buttonLogin = new By.ByXPath("//*[@id=\"root\"]/div/div/div[1]/div/form/button");
    public void clickButtonLogin() {
        clickButton(buttonLogin);
    }

    private final By locationButtonLogout = new By.ByXPath("//*[@id=\"root\"]/div/div[1]/div[2]/button");
    public void getLocationButtonLogout() {
        getLocation(locationButtonLogout);
    }

    private final By buttonLogout = new By.ByXPath("//*[@id=\"root\"]/div/div[1]/div[2]/button");
    public void clickButtonLogout() {
        clickButton(buttonLogout);
    }

    private final By buttonConfirmLogout = new By.ByXPath("/html/body/div[2]/div[3]/div/div/div[2]/div/button[2]");
    public void clickButtonConfirmLogout() {
        clickButton(buttonConfirmLogout);
    }

}
