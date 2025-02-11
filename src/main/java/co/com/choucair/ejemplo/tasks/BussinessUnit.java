package co.com.choucair.ejemplo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.choucair.ejemplo.userinterfaces.BussinessUnitPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class BussinessUnit implements Task {

    private final String name;

    public BussinessUnit(String name){
        this.name = name;
    }

    public static BussinessUnit inThePage(String name) {
        return Tasks.instrumented(BussinessUnit.class, name);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(MEETING, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(MEETING),
                WaitUntil.the(BUSSINESS_UNIT, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BUSSINESS_UNIT),
                WaitUntil.the(NEW_BUSSINESS_UNI_BUTTON, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(NEW_BUSSINESS_UNI_BUTTON),
                WaitUntil.the(NAME_TXT, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(name).into(NAME_TXT),
                WaitUntil.the(PARENT_UNIT_LIST, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PARENT_UNIT_LIST),
                Enter.theValue("Administration" + Keys.TAB + Keys.ENTER).into(PARENT_UNIT),
                WaitUntil.the(SAVE_BUTTON, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(SAVE_BUTTON),
                WaitUntil.the(TO_FIND, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(name+ Keys.ENTER).into(TO_FIND)
        );
    }
}
