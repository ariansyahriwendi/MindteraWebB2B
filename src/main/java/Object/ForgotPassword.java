package Object;

import BaseClass.BaseSetUp;
import org.openqa.selenium.By;

public class ForgotPassword extends BaseSetUp {

    private final By buttonForgotPassword = new By.ByXPath("//*[@id=\"root\"]/div/div[1]/form/div[3]/a");
    public void clickButtonForgotPassword() {
        clickButton(buttonForgotPassword);
    }

    private final By fieldEmailForgotPassword = new By.ByName("email");
    public void inputFieldEmailForgotPassword(String email) {
        inputText(fieldEmailForgotPassword, email);
    }

    private final By buttonSendForgotPassword = new By.ByXPath("//*[@id=\"root\"]/div/div[1]/form/button");
    public void clickButtonSendForgotPassword() {
        clickButton(buttonSendForgotPassword);
    }




}
