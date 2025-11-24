package co.com.udea.moduloprueba.stepdefinitions;
import co.com.udea.moduloprueba.tasks.SelectCities;
import co.com.udea.moduloprueba.questions.DisplayedFlights;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class ChooseFlightStep {

    @When("{actor} travels from {string} to {string}")
    public void travelsFromTo(Actor actor, String origin, String destination) {
        actor.attemptsTo(SelectCities.selectCities(origin, destination));
    }

    @Then("the following flights are displayed:")
    public void theFollowingFlightsAreDisplayed(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String, String>> expectedFlights = dataTable.asMaps(String.class, String.class);
        List<Map<String, String>> actualFlights = OnStage.theActorInTheSpotlight().asksFor(DisplayedFlights.list());


        for (Map<String, String> expected : expectedFlights) {
            assertThat(
                    "Subset check failed, expected row was not found: " + expected,
                    actualFlights,
                    hasItem(expected)
            );
        }

    }
}
