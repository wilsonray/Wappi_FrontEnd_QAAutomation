package com.wappi.qa.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.wappi.qa.userinterfaces.Login.VALIDATE_LOGIN;

public class Login implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((VALIDATE_LOGIN), WebElementStateMatchers.isVisible()));
        return Text.of(VALIDATE_LOGIN).viewedBy(actor).asString();
    }
    public static Login message(){
        return new Login();
    }
}
