package co.com.udea.moduloprueba.stepdefinitions;

import co.com.udea.moduloprueba.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.questions.SelectedValue;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class HomeSteps {

    @Given("{actor} is on home page")
    public void openTheWeb(Actor actor) {
        BrowseTheWeb.as(actor).open();
    }

    @When("{actor} choose the origin {}")
    public void chooseTheOrigin(Actor actor, String cityName) {
        actor.attemptsTo(
                SelectFromOptions.byValue(cityName).from(HomePage.FROM)
        );
    }

    @Then("{actor} see that the origin is {}")
    public void theOriginIs(Actor actor, String expectedOrigin) {
        actor.should(seeThat(SelectedValue.of(HomePage.FROM), equalTo(expectedOrigin)));
    }
}
