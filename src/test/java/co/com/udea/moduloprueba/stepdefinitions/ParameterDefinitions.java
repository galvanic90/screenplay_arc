package co.com.udea.moduloprueba.stepdefinitions;

import io.cucumber.java.ParameterType;
import net.serenitybdd.screenplay.Actor;

public class ParameterDefinitions {
    @ParameterType(".*")
    public Actor actor(String actorName) {
        return Actor.named(actorName);
    }
}
