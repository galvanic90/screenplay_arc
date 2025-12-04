package co.com.udea.moduloprueba.stepdefinitions;
import co.com.udea.moduloprueba.tasks.SelectFlight;
import co.com.udea.moduloprueba.utils.Pause;
import io.cucumber.java.en.And;
import net.serenitybdd.screenplay.Actor;

public class ChooseFirstFlightStep {

    @And("{actor} selects the first flight")
    public void chooseTheFirstFlight(Actor actor) {
        actor.attemptsTo(
                SelectFlight.firstAvailable()
        );
        actor.attemptsTo(Pause.forSeconds(3));
    }

}
