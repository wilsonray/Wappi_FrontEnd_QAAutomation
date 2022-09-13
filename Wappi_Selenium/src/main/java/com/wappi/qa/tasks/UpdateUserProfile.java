package com.wappi.qa.tasks;

import com.wappi.qa.models.UserProfileData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.Upload;
import net.serenitybdd.screenplay.actions.selectactions.SelectByIndexFromElement;
import net.serenitybdd.screenplay.actions.selectactions.SelectByIndexFromTarget;
import net.serenitybdd.screenplay.actions.selectactions.SelectByValueFromTarget;
import net.serenitybdd.screenplay.actions.type.TypeValue;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static com.wappi.qa.userinterfaces.UserProfile.*;

public class UpdateUserProfile implements Task {
    private UserProfileData userProfileData;
    public UpdateUserProfile(UserProfileData userProfileData){
        this.userProfileData = userProfileData;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(EDIT_PROFILE));
        actor.attemptsTo(Enter.theValue(userProfileData.getName()).into(NAME));
        actor.attemptsTo(Enter.theValue(userProfileData.getLastName()).into(LAST_NAME));
        actor.attemptsTo(Enter.theValue(userProfileData.getDateOfBirth()).into(DATE_OF_BIRTH));
        actor.attemptsTo(Click.on(COUNTRY));
        actor.attemptsTo(Click.on(SELECT_COLOMBIA));
        actor.attemptsTo(Click.on(SEX_FEMALE));
        Path data = null;
        try {
            data = Paths.get(ClassLoader.getSystemResource("shah.png").toURI());
        } catch (URISyntaxException ignore) {}
        actor.attemptsTo(Upload.theFile(data).to(SELECT_FILE));
        actor.attemptsTo(Click.on(SAVE_PROFILE));
    }

    public static UpdateUserProfile withData(UserProfileData userProfileData){
        return new UpdateUserProfile(userProfileData);
    }
}
