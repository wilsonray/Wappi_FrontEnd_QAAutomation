package com.wappi.qa.tasks;

import com.sun.javafx.scene.control.skin.TableCellSkin;
import com.wappi.qa.models.UserProfileData;
import com.wappi.qa.userinterfaces.ObtainCoupon;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;
import org.mockito.internal.matchers.Null;

import static com.wappi.qa.userinterfaces.ObtainCoupon.*;
import static com.wappi.qa.userinterfaces.PlaceOrder.*;

public class PlaceOrder implements Task {

    private int number;
    public PlaceOrder(int number){
        this.number=number;
    }

    public <T extends Actor> void performAs(T actor) {

        switch (number){
            case 0:{
                actor.attemptsTo(Click.on(ORDER_BUTTON));
                actor.attemptsTo(Click.on(CONFIRM_ORDER));
                break;
            }
            case 1:{
                actor.attemptsTo(Click.on(CLOSE_POPUP));
                actor.attemptsTo(Click.on(MY_ORDERS));
                break;
            }
        }

    }

    public static PlaceOrder withoutToken(int number){
        return new PlaceOrder(number);
    }
}
