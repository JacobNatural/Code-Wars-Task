// TASK CODEWARS
// https://www.codewars.com/kata/5a49f074b3bfa89b4c00002b/train/java
package pl.jakubmarjankowski.codewars.StringSubpatternRecognition;

public class Kata {
    public static boolean hasSubpattern(String str) {
        StringBuilder regex = new StringBuilder();
        StringBuilder length = new StringBuilder();
        StringBuilder stringBuilder = new StringBuilder(str);
        for (int i = 1; i <= stringBuilder.length() / 2; i++) {
            regex.append(stringBuilder.substring(0, i));
            if (stringBuilder.length() % regex.length() == 0) {
                length.append(str.replaceAll(regex.toString(), ""));
                if (length.length() == 0) return true;
            }
            regex.setLength(0);
            length.setLength(0);
        }
        return false;
    }
}
