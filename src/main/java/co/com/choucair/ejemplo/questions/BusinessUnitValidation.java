package co.com.choucair.ejemplo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class BusinessUnitValidation implements Question<Boolean> {

    private final Target validacion;
    private final String name;

    @Override
    public Boolean answeredBy(Actor actor) {
        return validacion.resolveFor(actor).getText().equals(name);
    }

    public BusinessUnitValidation(Target validacion, String message) {
        this.validacion = validacion;
        this.name = message;
    }

    public static BusinessUnitValidation inThePage(Target validacion, String name) {
        return new BusinessUnitValidation(validacion, name);
    }
}
