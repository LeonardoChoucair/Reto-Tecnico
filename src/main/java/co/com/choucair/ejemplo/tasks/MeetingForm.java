package co.com.choucair.ejemplo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import static co.com.choucair.ejemplo.userinterfaces.BussinessUnitPage.*;
import static co.com.choucair.ejemplo.userinterfaces.MeetingPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class MeetingForm implements Task {

    private final String meetingName;
    private final String meetingNumber;
    private final String startDate;
    private final String endDate;
    private final String unit;

    public MeetingForm(String meetingName, String meetingNumber, String startDate, String endDate, String unit) {
        this.meetingName = meetingName;
        this.meetingNumber = meetingNumber;
        this.startDate = startDate;
        this.endDate = endDate;
        this.unit = unit;
    }


    public static MeetingForm inThePage(String meetingName, String meetingNumber, String startDate, String endDate, String Unit) {
        return Tasks.instrumented(MeetingForm.class,meetingName,meetingNumber,startDate,endDate,Unit);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(MEETING_NAME, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(meetingName).into(MEETING_NAME),
                Click.on(MEETING_TYPE),
                Click.on(CUSTOMER_TYPE),
                Enter.theValue(meetingNumber).into(MEETING_NUMBER),
                Enter.theValue(startDate).into(START_DATE),
                Enter.theValue(endDate).into(END_DATE),
                Click.on(LOCATION),
                Click.on(OPTION_ONE),
                Click.on(UNIT),
                Enter.theValue(unit).into(SEARCH_UNIT),
                Enter.theValue(Keys.ENTER).into(SEARCH_UNIT),
                Click.on(ORGANIZED_BY),
                Click.on(OPTION_ONE),
                Click.on(REPORTER),
                Click.on(OPTION_ONE),
                Click.on(LIST_OF_ATTENDEES),
                Click.on(OPTION_ONE),
                Click.on(ATTENDEE_TYPE),
                Click.on(ATTENDEE_TYPE_OPC2),
                Click.on(ATTENDANCE_STATUS),
                Click.on(ATTENDANCE_STATUS_OPC2),
                Click.on(SAVE_BUTTON),
                Enter.theValue(meetingName).into(SEARCH_MEETING),
                Enter.theValue(Keys.ENTER).into(SEARCH_MEETING)
        );
    }
}
