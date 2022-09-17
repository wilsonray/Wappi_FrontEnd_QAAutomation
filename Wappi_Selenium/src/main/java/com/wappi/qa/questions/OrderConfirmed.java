package com.wappi.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.wappi.qa.userinterfaces.PlaceOrder.ORDER_CONFIRMED_POPUP;

public class OrderConfirmed implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((ORDER_CONFIRMED_POPUP), WebElementStateMatchers.isVisible()));
        return Text.of(ORDER_CONFIRMED_POPUP).viewedBy(actor).asString();
    }
    public static OrderConfirmed message(){
        return new OrderConfirmed();
    }
}
