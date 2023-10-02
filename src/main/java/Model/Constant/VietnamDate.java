package Model.Constant;

import java.text.DateFormatSymbols;
import java.time.LocalDate;

public class VietnamDate {

    public String getCurrentDate() {
        LocalDate dateNow = LocalDate.now();
        return Integer.toString(dateNow.getDayOfMonth());
    }

    public String getCurrentMonth() {
        return new DateFormatSymbols().getMonths()[LocalDate.now().getMonthValue() - 1];
    }

    public String getCurrentYear() {
        return Integer.toString(LocalDate.now().getYear());
    }
}
