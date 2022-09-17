package com.wappi.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.wappi.qa.userinterfaces.PlaceOrder.CONFIRM_PRODUCT;

public class ProductWasAdded implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((CONFIRM_PRODUCT), WebElementStateMatchers.isVisible()));
        return Text.of(CONFIRM_PRODUCT).viewedBy(actor).asString();
    }
    public static ProductWasAdded message(){
        return new ProductWasAdded();
    }
}
