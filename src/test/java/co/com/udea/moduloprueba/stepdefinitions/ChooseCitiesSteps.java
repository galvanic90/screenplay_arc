package co.com.udea.moduloprueba.stepdefinitions;

import co.com.udea.moduloprueba.pages.HomePage;
import co.com.udea.moduloprueba.tasks.SelectCities;
import co.com.udea.moduloprueba.utils.Pause;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.questions.SelectedValue;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class ChooseCitiesSteps {

    @Given("{actor} is on home page")
    public void openTheWeb(Actor actor) {
        BrowseTheWeb.as(actor).open();
    }

    @When("{actor} choose the origin {}")
    public void chooseTheOrigin(Actor actor, String cityName) {
        actor.attemptsTo(
                SelectFromOptions.byValue(cityName).from(HomePage.FROM)
        );
        actor.attemptsTo(Pause.forSeconds(2));
    }

    @Then("{actor} see that the origin is {}")
    public void theOriginIs(Actor actor, String expectedOrigin) {
        actor.should(seeThat(SelectedValue.of(HomePage.FROM), equalTo(expectedOrigin)));
    }

    @When("{actor} choose the destination {}")
    public void chooseTheDestination(Actor actor, String cityName) {
        actor.attemptsTo(
                SelectFromOptions.byValue(cityName).from(HomePage.TO)
        );
        actor.attemptsTo(Pause.forSeconds(2));
    }

    @Then("{actor} see that the destination is {}")
    public void theDestinationIs(Actor actor, String expectedOrigin) {
        actor.should(seeThat(SelectedValue.of(HomePage.TO), equalTo(expectedOrigin)));
    }

    @When("{actor} travels from {} to {}")
    public void travels(Actor actor, String from, String to) {
        actor.attemptsTo(
                SelectCities.selectCities(from, to)
        );
        actor.attemptsTo(Pause.forSeconds(2));
    }
}
