package com.wappi.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.wappi.qa.userinterfaces.ObtainCoupon.*;
import static com.wappi.qa.userinterfaces.ObtainCoupon.COUPON_FIELD;
import static com.wappi.qa.userinterfaces.PlaceOrder.*;

public class PlaceOrderWithToken implements Task {

    private int number;
    public PlaceOrderWithToken(int number){
        this.number=number;
    }

    public <T extends Actor> void performAs(T actor) {

        switch (number){
            case 0:{
                actor.attemptsTo(Click.on(OBTAIN_WELCOME_COUPON));
                break;
            }
            case 1:{
                String couponCode = BrowseTheWeb.as(actor).findBy(COUPON_TEXT.getCssOrXPathSelector()).getText();
                actor.attemptsTo(Click.on(CLOSE_COUPON_POPUP));
                actor.attemptsTo(Click.on(HOME_VIEW));
                actor.attemptsTo(Click.on(ORDER_BUTTON));
                actor.attemptsTo(Enter.theValue(couponCode).into(COUPON_FIELD));
                actor.attemptsTo(Click.on(CONFIRM_ORDER));
                break;
            }
            case 2:{
                actor.attemptsTo(Click.on(CLOSE_POPUP));
                actor.attemptsTo(Click.on(MY_ORDERS));
                break;
            }
            default:{
                break;
            }
        }

    }

    public static PlaceOrderWithToken withToken(int number){
        return new PlaceOrderWithToken(number);
    }
}
