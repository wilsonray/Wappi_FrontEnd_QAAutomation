package com.wappi.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login {

    public static  final Target USER_NAME = Target
            .the("Enter username")
            .located(By.id("username"));
    public static  final Target USER_PASSWORD = Target
            .the("Enter password")
            .located(By.id("password"));
    public static  final Target CLICK_SIGNIN_BUTTON = Target
            .the("Submit Sign in")
            .located(By.id("button-login"));
    public static  final Target VALIDATE_LOGIN = Target
            .the("Check user name to validate login")
            .located(By.linkText("Inicio"));
}
