package co.com.udea.moduloprueba.stepdefinitions;

import co.com.udea.moduloprueba.pages.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.SelectedValue;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class StepDefinition {

    @Before
    public void config(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("user");
    }

    @Given("I am on home page")
    public void openTheWeb() {
        BrowseTheWeb.as(OnStage.theActorInTheSpotlight()).open();
    }

    @When("I choose the origin {}")
    public void chooseTheOrigin(String cityName) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SelectFromOptions.byValue(cityName).from(HomePage.FROM)
        );
    }

    @Then("The origin is {}")
    public void theOriginIs(String expectedOrigin) {
        OnStage.theActorInTheSpotlight().should(seeThat(SelectedValue.of(HomePage.FROM), equalTo(expectedOrigin)));
    }
}
