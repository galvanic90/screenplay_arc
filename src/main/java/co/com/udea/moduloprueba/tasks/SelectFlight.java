package co.com.udea.moduloprueba.tasks;

import co.com.udea.moduloprueba.pages.FlightResultsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectFlight implements Task {

    public static SelectFlight firstAvailable() {
        return Tasks.instrumented(SelectFlight.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FlightResultsPage.FIRST_CHOOSE_BUTTON)
        );
    }

}
