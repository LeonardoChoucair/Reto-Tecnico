package co.com.choucair.ejemplo.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class LoginData {
    private String username;
    private String password;

    public static List<LoginData> setData(DataTable datatable) {
        List<LoginData> dates = new ArrayList<>();
        List<Map<String, String>> mapInfo = datatable.asMaps();
        for (Map<String, String> map : mapInfo) {
            dates.add(new ObjectMapper().convertValue(map, LoginData.class));
        }
        return dates;
    }
}
