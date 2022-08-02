package СonstruсtorLec2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Url {
    String url;
    int day;
    int month;
    int years;
    String result;
    Url (String url, int day, int month, int years){
        this.url = url;
        this.day = day;
        this.month = month;
        this.years = years;
        LocalDate localDate = LocalDate.of(years,month,day);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        String data = localDate.format(formatter);
        this.result = url + data;


    }
}
