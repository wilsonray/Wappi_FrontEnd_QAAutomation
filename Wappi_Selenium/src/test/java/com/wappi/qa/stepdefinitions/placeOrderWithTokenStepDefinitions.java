package com.wappi.qa.stepdefinitions;

import com.wappi.qa.questions.CouponPopup;
import com.wappi.qa.tasks.PlaceOrder;
import com.wappi.qa.tasks.PlaceOrderWithToken;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class placeOrderWithTokenStepDefinitions {
    @When("^the user clicks Obtain Welcome Coupon$")
    public void the_user_clicks_Obtain_Welcome_Coupon() {
        OnStage.theActorInTheSpotlight().attemptsTo(PlaceOrderWithToken.withToken(0));
    }
    @Then("^the user should see the Coupon pop-up$")
    public void the_user_should_see_the_Coupon_pop_up() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CouponPopup.message(), org.hamcrest.Matchers.is("Copia este código y úsalo para disfrutar de un descuento por única vez")));
    }
    @When("^the user copies the Coupon code and clicks the Order button and pastes the Coupon code$")
    public void the_user_clicks_the_Order_button_and_pastes_the_Coupon_code() {
        OnStage.theActorInTheSpotlight().attemptsTo(PlaceOrderWithToken.withToken(1));
    }
    @When("^the user clicks My orders button \\(with Token\\)$")
    public void the_user_clicks_My_orders_button() {
        OnStage.theActorInTheSpotlight().attemptsTo(PlaceOrderWithToken.withToken(2));
    }
}
