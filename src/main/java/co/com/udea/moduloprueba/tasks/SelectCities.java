package co.com.udea.moduloprueba.tasks;

import co.com.udea.moduloprueba.pages.HomePage;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectCities implements Task {
    private final String origin;
    private final String destination;

    public SelectCities(String origin, String destination) {
        this.origin = origin;
        this.destination = destination;
    }

    @Override
    
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                SelectFromOptions.byValue(origin).from(HomePage.FROM),
                SelectFromOptions.byValue(destination).from(HomePage.TO),
                Click.on(HomePage.FIND_FLIGHTS)
        );
    }

    public static SelectCities selectCities(String origin, String destination) {
        return instrumented(SelectCities.class, origin, destination);
    }
}