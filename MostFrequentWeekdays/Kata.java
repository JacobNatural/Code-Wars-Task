// TASK CODEWARS
// https://github.com/JacobNatural/Code-Wars-Task/upload/Main
package pl.jakubmarjankowski.codewars.MostFrequentWeekdays;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Locale;
public class Kata {
    public static String[] mostFrequentDays(int year) {

        int lengthOfYear = LocalDate.ofYearDay(year, 1).lengthOfYear();
        String result = "";

        String [] dayOfWeek = {"Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday" };
        int[] occurencesPerDay = {0, 0, 0, 0, 0, 0, 0};
        System.out.println(LocalDate.ofYearDay(year, 1).getDayOfWeek());

        for(int i = 1; i <= lengthOfYear; i++){
            String onedayOfWeek = String.valueOf(LocalDate.ofYearDay(year, i).getDayOfWeek());
            for(int j = 0; j < dayOfWeek.length; j++){
                if(onedayOfWeek.equals(dayOfWeek[j].toUpperCase(Locale.ROOT))){
                    occurencesPerDay[j] += 1;
                }
            }
        }
        int max = Arrays.stream(occurencesPerDay).max().getAsInt();
        for(int i = 0; i < occurencesPerDay.length; i++){
                if (max == occurencesPerDay[i]) result += dayOfWeek[i] + " ";
        }
        return result.split(" ");
    }
}
