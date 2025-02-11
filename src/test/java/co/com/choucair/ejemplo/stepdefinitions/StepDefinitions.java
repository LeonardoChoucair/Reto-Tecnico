package co.com.choucair.ejemplo.stepdefinitions;

import co.com.choucair.ejemplo.questions.BusinessUnitValidation;
import co.com.choucair.ejemplo.tasks.*;
import co.com.choucair.ejemplo.utils.KillBrowser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import java.io.IOException;
import java.util.List;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static co.com.choucair.ejemplo.userinterfaces.BussinessUnitPage.*;

public class StepDefinitions {

    @Before
    public void initialConfigurationDektop() {
        OnStage.setTheStage(new OnlineCast());
    }

    @After
    public static void CloseDriver() throws IOException, InterruptedException {
        SerenityWebdriverManager.inThisTestThread().getCurrentDriver().quit();
        KillBrowser.processes(List.of((SerenityWebdriverManager.inThisTestThread().getCurrentDriverName()).split(":")).get(0));
    }

    @Given("the user logged in to the StartSharp website with the username {string} and the password {string}")
    public void theUserLoggedInToTheStartSharpWebsiteWithTheUsernameAndThePassword(String username, String password) {
        OnStage.theActorCalled("Actor").wasAbleTo(
                Open.url("https://demo.serenity.is/"));
        OnStage.theActorInTheSpotlight().attemptsTo(LoginWithData.inThePage(username, password));
    }
    @When("I try to create a business unit {string}")
    public void iTryToCreateABusinessUnit(String name) {
        OnStage.theActorInTheSpotlight().attemptsTo(BussinessUnit.inThePage(name));
    }
    @Then("I validate the creation of the unit {string}")
    public void iValidateTheCreationOfTheUnit(String name)  {
        OnStage.theActorInTheSpotlight().should(seeThat(BusinessUnitValidation.inThePage(VALIDATION, name)));
    }

    @When("I try to create a meeting")
    public void iTryToCreateAMeeting() {
        OnStage.theActorInTheSpotlight().attemptsTo(Meeting.inThePage());
    }

    @When("complete all the fields of the form for the business unit {string}{string}{string}{string}{string}")
    public void completeAllTheFieldsOfTheFormForTheBusinessUnit(String meetingName, String meetingNumber, String startDate, String endDate, String unit){
        OnStage.theActorInTheSpotlight().attemptsTo(MeetingForm.inThePage(meetingName,meetingNumber,startDate,endDate,unit));
    }
    @Then("validate the meeting creation {string}")
    public void validateTheMeetingCreation(String meetingName) {
        OnStage.theActorInTheSpotlight().should(seeThat(BusinessUnitValidation.inThePage(VALIDATION, meetingName)));
    }
}
