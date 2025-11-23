package co.com.udea.moduloprueba.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ui.Dropdown;

public class StepDefinition {

    @Before
    public void config(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("user");
    }

    @Given("I am on home page")
    public void iOpenTheWeb() {
        BrowseTheWeb.as(OnStage.theActorInTheSpotlight()).open();
    }

    @When("I choose the origin {}")
    public void iChooseTheOrigin(String text) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(Dropdown.withNameOrId("fromPort")),
                Click.on(Dropdown.withNameOrId("fromPort").containingText(text))
        );
    }
}
