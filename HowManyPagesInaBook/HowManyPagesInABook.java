// TASK CODEWARS
// https://www.codewars.com/kata/622de76d28bf330057cd6af8/train/java
package pl.jakubmarjankowski.codewars.HowManyPagesInaBook;

public class HowManyPagesInABook {
    public static int amountOfPages(int summary) {
        StringBuilder numbers = new StringBuilder();
        for(int i = 0; i < summary; i++){
            numbers.append(i);
            if(numbers.length() == summary) return i;
        }
        return 0;
    }
}
