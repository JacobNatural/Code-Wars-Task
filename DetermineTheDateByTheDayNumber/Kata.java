// TASK CODEWARS
// https://www.codewars.com/kata/602afedfd4a64d0008eb4e6e/train/java
package pl.jakubmarjankowski.codewars.DetermineTheDateByTheDayNumber;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Kata {
    public static String getDay(int day, boolean isLeap) {
        LocalDate date;
        String result;
        if(isLeap){
            date = LocalDate.ofYearDay(2024, day);
        }else {
            date = LocalDate.ofYearDay(2023, day);
        }
        result = date.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH) + ", " + date.getDayOfMonth();
        return result;
    }
}
