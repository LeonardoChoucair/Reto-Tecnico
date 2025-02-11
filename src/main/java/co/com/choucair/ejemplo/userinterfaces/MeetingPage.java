package co.com.choucair.ejemplo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MeetingPage {
    public static final Target METTINGS = Target.the("Meeting")
            .located(By.xpath("//span[text()='Meetings']"));
    public static final Target NEW_MEETING_BUTTON = Target.the("New Meeting Button")
            .located(By.xpath("(//*[@class='button-inner'])[1]"));
    public static final Target MEETING_NAME = Target.the("Name meeting")
            .located(By.id("Serenity_Pro_Meeting_MeetingDialog10_MeetingName"));
    public static final Target MEETING_TYPE = Target.the("Type Meeting")
            .located(By.xpath("//*[@id='select2-chosen-6']"));
    public static final Target CUSTOMER_TYPE = Target.the("Type Customer")
            .located(By.xpath("//*[@id='select2-result-label-14']"));
    public static final Target MEETING_NUMBER = Target.the("Number Meeting")
            .located(By.xpath("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber']"));
    public static final Target START_DATE = Target.the("Start Date")
            .located(By.xpath("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_StartDate']"));
    public static final Target END_DATE = Target.the("End Date")
            .located(By.xpath("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_EndDate']"));
    public static final Target LOCATION = Target.the("Location")
            .located(By.xpath("//*[@id='select2-chosen-7']"));
    public static final Target UNIT = Target.the("Unit")
            .located(By.xpath("//*[@id='select2-chosen-8']"));
    public static final Target SEARCH_UNIT = Target.the("Search unit")
            .located(By.cssSelector("#s2id_autogen8_search"));
    public static final Target ORGANIZED_BY = Target.the("Organized By")
            .located(By.xpath("//*[@id='select2-chosen-9']"));
    public static final Target REPORTER = Target.the("Reporter")
            .located(By.xpath("//*[@id='select2-chosen-10']"));
    public static final Target OPTION_ONE = Target.the("Option One")
            .located(By.xpath("(//*[@class='select2-result-label'])[1]"));
    public static final Target LIST_OF_ATTENDEES = Target.the("List of Attendees")
            .located(By.xpath("//*[@id='select2-chosen-12']"));
    public static final Target ATTENDEE_TYPE = Target.the("Attendee Tye")
            .located(By.xpath("//*[@class='slick-cell l2 r2']/select"));
    public static final Target ATTENDANCE_STATUS = Target.the("Attendee Type")
            .located(By.xpath("//*[@class='slick-cell l3 r3']/select"));
    public static final Target ATTENDEE_TYPE_OPC2 = Target.the("Attendee tipe Option 2")
            .located(By.xpath("//*[@class='slick-cell l2 r2']/select/option[2]"));
    public static final Target ATTENDANCE_STATUS_OPC2 = Target.the("Attendance status option 2")
            .located(By.xpath("//*[@class='slick-cell l3 r3']/select/option[2]"));
    public static final Target SEARCH_MEETING = Target.the("Search Meeting")
            .located(By.id("Serenity_Pro_Meeting_MeetingGrid0_QuickSearchInput"));

}
