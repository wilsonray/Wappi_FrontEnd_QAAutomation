package com.wappi.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UserProfile {
    public static  final Target EDIT_PROFILE = Target
            .the("Click User profile view")
            .located(By.linkText("Información personal"));
    public static  final Target NAME = Target
            .the("Enter username")
            .located(By.id("name"));
    public static  final Target LAST_NAME = Target
            .the("Enter username")
            .located(By.id("lastName"));
    public static  final Target DATE_OF_BIRTH = Target
            .the("Enter username")
            .located(By.id("bornDate"));
    public static  final Target COUNTRY = Target
            .the("Enter username")
            .located(By.id("country"));
    public static  final Target SELECT_COLOMBIA = Target
            .the("Enter username")
            .located(By.xpath("//*[@id='country']/option[3]"));
    public static  final Target SEX_MALE = Target
            .the("Enter username")
            .located(By.id("M"));
    public static  final Target SEX_FEMALE = Target
            .the("Enter username")
            .located(By.id("F"));
    /*public static  final Target SELECT_FILE = Target
            .the("Select image file to upload")
            .located(By.id("image"));*/
    public static  final Target SELECT_FILE = Target
            .the("Select image file to upload")
            .located(By.xpath("//input[@id='image']"));

    public static  final Target SAVE_PROFILE = Target
            .the("Enter username")
            .located(By.id("save-profile"));
}
