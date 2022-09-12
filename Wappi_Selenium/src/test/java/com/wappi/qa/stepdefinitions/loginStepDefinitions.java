package com.wappi.qa.stepdefinitions;

import com.wappi.qa.models.CredentialsData;
import com.wappi.qa.questions.Login;
import com.wappi.qa.tasks.LoginUser;
import com.wappi.qa.tasks.OpenBrowser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class loginStepDefinitions {

    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnStage(){
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Wilson Ray Villanueva");
    }

    @Given("^that the user is in the Wappi page$")
    public void thatThUserIsInTheWappiPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.browser());
    }

    @When("^he enters the credentials$")
    public void heEntersTheCredentials(List<CredentialsData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(LoginUser.withData(data.get(0)));
    }

    @Then("^the user should see the main page$")
    public void theUserShouldSeeTheMainPage() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Login.message(), org.hamcrest.Matchers.is("Inicio")));
    }
}
