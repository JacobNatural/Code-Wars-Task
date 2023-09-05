// TASK CODEWARS
// https://www.codewars.com/kata/60a1aac7d5a5fc0046c89651/train/java
package pl.jakubmarjankowski.codewars.LastSurvivorEp2;

import java.util.Arrays;

public class Kata {

    public static String lastSurvivors(String str) {

        int length = 0;

        while (length != str.length()) {
            length = str.length();
            char letter = 'a';
            while (letter <= 'z') {
                String finder = "";
                finder += letter;
                finder += letter;
                char temp = letter;
                temp += 1;
                if (temp > 122) temp -= 26;
                str = str.replaceAll(finder, String.valueOf(temp));
                letter++;
                char[] charForSort = str.toCharArray();
                Arrays.sort(charForSort);
                str = String.valueOf(charForSort);
            }
        }
        return str;
    }
}
