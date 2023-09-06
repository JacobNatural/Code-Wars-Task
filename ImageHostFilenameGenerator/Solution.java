// TASK CODEWARS
// https://www.codewars.com/kata/586a933fc66d187b6e00031a/train/java
package pl.jakubmarjankowski.codewars.ImageHostFilenameGenerator;

public class Solution {
    public static String generateName(PhotoManager photoManager) {

        int min = 65, max = 90;
        String result = "";
        boolean trueFalse = true;

        while (trueFalse) {
            for (int i = 0; i < 6; i++) {
                char a = (char) ( min + (Math.random() * (max - min) + 1.0));
                result += a;
            }
            if (photoManager.nameExists(result)) {
                trueFalse = true;
                result = "";
            }else {
                trueFalse = false;
            }
        }
        return result;
    }
}
