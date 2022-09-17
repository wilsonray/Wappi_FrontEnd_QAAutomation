package com.wappi.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.wappi.qa.userinterfaces.ObtainCoupon.COUPON_POPUP;
public class CouponPopup implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((COUPON_POPUP), WebElementStateMatchers.isVisible()));
        return Text.of(COUPON_POPUP).viewedBy(actor).asString();
    }
    public static CouponPopup message(){
        return new CouponPopup();
    }
}
