package com.wappi.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ObtainCoupon {
    public static  final Target OBTAIN_WELCOME_COUPON = Target
            .the("Click to obtain welcome coupon")
            .located(By.id("welcome-coupon"));
    public static  final Target COUPON_TEXT = Target
            .the("Click on the Coupon code field")
            .locatedBy("//span[2]");
    public static  final Target CLOSE_COUPON_POPUP = Target
            .the("Close coupon pop-up")
            .located(By.xpath("//*[@id='coupon-modal']/div/span[1]"));
    public static  final Target COUPON_FIELD = Target
            .the("Close coupon pop-up")
            .located(By.xpath("//*[@id='coupon']"));
    public static  final Target COUPON_POPUP = Target
            .the("Coupon pop-up appeared")
            .located(By.xpath("//*[@id='coupon-modal']/div/p"));


}
