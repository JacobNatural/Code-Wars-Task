// TASK CODEWARS
// https://www.codewars.com/kata/54ff3102c1bad923760001f3/train/java
package pl.jakubmarjankowski.codewars.VowelCount;

import java.util.List;

public class Vowels {
    public static int getCount(String str) {
        String vowels = "aeoiu";
        int count = 0;
        for (char c : str.toCharArray()) {
            if (vowels.contains(String.valueOf(c)))
                count++;
        }
        return count;
    }
}