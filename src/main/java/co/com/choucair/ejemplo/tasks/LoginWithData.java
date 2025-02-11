package co.com.choucair.ejemplo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.choucair.ejemplo.userinterfaces.LoginPage.*;

public class LoginWithData implements Task {

    private final String user;
    private final String password;

    public LoginWithData(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public static LoginWithData inThePage(String user, String password) {
        return Tasks.instrumented(LoginWithData.class, user, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.angularRequestsHaveFinished(),
                Enter.theValue(user).into(USERNAME_INPUT),
                Enter.theValue(password).into(PASSWORD_INPUT),
                Click.on(LOGIN_BUTTON)
        );
    }
}
