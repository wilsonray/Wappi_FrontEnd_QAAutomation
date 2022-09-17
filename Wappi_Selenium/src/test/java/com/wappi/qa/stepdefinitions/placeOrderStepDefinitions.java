package com.wappi.qa.stepdefinitions;

import com.wappi.qa.questions.Login;
import com.wappi.qa.questions.OrderConfirmed;
import com.wappi.qa.questions.ProductWasAdded;
import com.wappi.qa.tasks.PlaceOrder;
import com.wappi.qa.tasks.PlaceOrderWithToken;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class placeOrderStepDefinitions {
    @When("^the user clicks the Order button$")
    public void the_user_clicks_the_Order_button() {
        OnStage.theActorInTheSpotlight().attemptsTo(PlaceOrder.withoutToken(0));
    }
    @Then("^the user should see the Confirm Order pop-up$")
    public void the_user_should_see_the_Confirm_Order_pop_up() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(OrderConfirmed.message(), org.hamcrest.Matchers.is("Tu pedido ha sido confirmado, te mantendremos informado ante nuevas novedades")));
    }
    @When("^the user clicks My orders button$")
    public void the_user_clicks_My_orders_button() {
        OnStage.theActorInTheSpotlight().attemptsTo(PlaceOrder.withoutToken(1));
    }

    @Then("^the user should see the Product added to the list$")
    public void the_user_should_see_the_Product_added_to_the_list() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ProductWasAdded.message(), org.hamcrest.Matchers.is("Aceite de Girasol")));
    }

    //With Coupon

}
