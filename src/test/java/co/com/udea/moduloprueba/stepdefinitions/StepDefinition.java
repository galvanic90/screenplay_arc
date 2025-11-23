package co.com.udea.moduloprueba.stepdefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class StepDefinition {

    @Before
    public void config(){
        OnStage.setTheStage(new OnlineCast());
    }
}
