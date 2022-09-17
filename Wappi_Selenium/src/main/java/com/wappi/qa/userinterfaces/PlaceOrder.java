package com.wappi.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PlaceOrder {

    public static  final Target ORDER_BUTTON = Target
            .the("Click order")
            .located(By.xpath("//button[contains(.,'Pedir')]"));
    public static  final Target CONFIRM_ORDER = Target
            .the("Click confirm order")
            .located(By.id("order-confirm"));
    public static  final Target ORDER_CONFIRMED_POPUP = Target
            .the("Check pop-up that confirms the order")
            .located(By.xpath("//*[@id='confirmation-modal']/div/p"));
    public static  final Target CLOSE_POPUP = Target
            .the("Click prodduct was added to My orders")
            .located(By.xpath("//div[@class='modal opened']//span[@class='close']"));
    public static  final Target MY_ORDERS = Target
            .the("Click My orders view")
            .located(By.linkText("Mis pedidos"));
    public static  final Target CONFIRM_PRODUCT = Target
            .the("Check prodduct was added to My orders")
            .located(By.xpath("//tr[1]//td[contains(.,'Aceite de Girasol')]"));
    public static  final Target HOME_VIEW = Target
            .the("Click Home view")
            .located(By.linkText("Inicio"));

}
