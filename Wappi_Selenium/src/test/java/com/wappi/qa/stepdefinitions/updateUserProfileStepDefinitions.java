package com.wappi.qa.stepdefinitions;

import com.wappi.qa.models.CredentialsData;
import com.wappi.qa.models.UserProfileData;
import com.wappi.qa.tasks.LoginUser;
import com.wappi.qa.tasks.UpdateUserProfile;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class updateUserProfileStepDefinitions {
    @When("^the user clicks the Profile view button$")
    public void the_user_clicks_the_Profile_view_button(List<UserProfileData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(UpdateUserProfile.withData(data.get(0)));
    }

    @Then("^I should see the profile menu$")
    public void i_should_see_the_profile_menu() {

    }
}
