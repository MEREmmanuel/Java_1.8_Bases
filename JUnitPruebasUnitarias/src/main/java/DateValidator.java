
import java.util.Calendar;

public class DateValidator {

    public boolean isValidDate(int year, int month, int day) {
        if (year < 1) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);
        int lastDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        if (day < 1 || day > lastDayOfMonth) {
            return false;
        }
        return true;
    }
}
