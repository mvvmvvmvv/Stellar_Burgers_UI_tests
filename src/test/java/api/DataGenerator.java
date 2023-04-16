package api;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

public class DataGenerator {

    public static String getRandomEmail() {
        String timestamp = new SimpleDateFormat("yyyyMMddHHss").format(new java.util.Date());
        return "praktikum" + timestamp + "@example.net";
    }

    public static Map<String,String> getRegistrationData() {
        Map<String,String> data = new HashMap<>();
        data.put("email", DataGenerator.getRandomEmail());
        data.put("password", "123456");
        data.put("name", "User202304150019");

        return data;
    }
}

