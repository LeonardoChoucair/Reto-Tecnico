package co.com.choucair.ejemplo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.choucair.ejemplo.userinterfaces.BussinessUnitPage.*;
import static co.com.choucair.ejemplo.userinterfaces.MeetingPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class Meeting implements Task {

    public static Meeting inThePage() {
        return Tasks.instrumented(Meeting.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(MEETING, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(MEETING),
                WaitUntil.the(METTINGS, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(METTINGS),
                WaitUntil.the(NEW_MEETING_BUTTON, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(NEW_MEETING_BUTTON)
        );
    }
}
