package co.com.choucair.ejemplo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BussinessUnitPage {
    public static final Target MEETING = Target.the("Meeting")
            .located(By.xpath("//span[text()='Meeting']"));
    public static final Target BUSSINESS_UNIT = Target.the("Bussiness Unit")
            .located(By.xpath("//span[text()='Business Units']"));
    public static final Target NEW_BUSSINESS_UNI_BUTTON = Target.the("New Bussiness Unit")
            .located(By.xpath("(//*[@class='button-inner'])[1]"));
    public static final Target NAME_TXT = Target.the("Name")
            .located(By.id("Serenity_Pro_Meeting_BusinessUnitDialog3_Name"));
    public static final Target PARENT_UNIT_LIST = Target.the("Parent Unit List")
            .located(By.xpath("//span[@role='presentation']"));
    public static final Target PARENT_UNIT = Target.the("Parent Unit")
            .located(By.cssSelector("#s2id_autogen1_search"));
    public static final Target SAVE_BUTTON = Target.the("Button Save")
            .located(By.xpath("//div[@data-action='save-and-close']"));
    public static final Target TO_FIND = Target.the("To Find")
            .located(By.id("Serenity_Pro_Meeting_BusinessUnitGrid0_QuickSearchInput"));
    public static final Target VALIDATION = Target.the("Validation")
            .located(By.xpath("(//*[@class='slick-cell l1 r1']/a)[1]"));
}
