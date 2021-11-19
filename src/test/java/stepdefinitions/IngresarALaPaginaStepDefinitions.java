package stepdefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class IngresarALaPaginaStepDefinitions {

    @Before
    public void inicio() {
        setTheStage (new OnlineCast());
    }

}
