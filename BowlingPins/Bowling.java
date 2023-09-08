// TASK CODEWARS
// https://www.codewars.com/kata/585cf93f6ad5e0d9bf000010/train/java
package pl.jakubmarjankowski.codewars.BowlingPins;

public class Bowling {
    public static String bowlingPins(int[] arr){
        StringBuilder pins = new StringBuilder("I I I I\n I I I \n  I I  \n   I   ");
        String numbers ="7 8 9 10\n 4 5 6 \n  2 3  \n   1   ";
        for(int i = 0; i < arr.length; i++){
            int number = numbers.lastIndexOf(String.valueOf(arr[i]));
            if(number > 7)number--;
            pins.replace(number , number + 1, " ");
        }
    return pins.toString();
    }
}
