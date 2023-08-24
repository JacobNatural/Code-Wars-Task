//// TASK CODEWARS
//https://www.codewars.com/kata/566d5e2e57d8fae53c00000c
package pl.jakubmarjankowski.codewars.BingoCard;

import java.util.ArrayList;
import java.util.List;

public class BingoCard {
    public static String[] getCard() {
        String [] result = new String[24];
        List<Integer> numbers = new ArrayList<>();

        for(int i = 0; i < 24; ){
            if(i < 5){
                int temp = (int)(Math.random() * 15) + 1;
                if(!numbers.contains(temp)) {
                    numbers.add(temp);
                    result[i] = "B";
                    result[i] += temp;
                    i++;
                }
            }
            if(i >= 5 && i < 10) {
                int temp = (int) (Math.random() * (30 - 16)) + 16;
                if (!numbers.contains(temp)) {
                    numbers.add(temp);
                    result[i] = "I";
                    result[i] += temp;
                    i++;
                }
            }
            if(i >=10 && i < 14) {
                int temp = (int) (Math.random() * (45 - 31)) + 31;
                if (!numbers.contains(temp)) {
                    numbers.add(temp);
                    result[i] = "N";
                    result[i] += temp;
                    i++;
                }
            }
            if( i >= 14 && i < 19) {
                int temp = (int) (Math.random() * (46 - 60)) + 60;
                if (!numbers.contains(temp)) {
                    numbers.add(temp);
                    result[i] = "G";
                    result[i] += temp;
                    i++;
                }
            }
            if(i >= 19) {
                int temp = (int) (Math.random() * (75 - 61)) + 61;
                if (!numbers.contains(temp)) {
                    numbers.add(temp);
                    result[i] = "O";
                    result[i] += temp;
                    i++;
                }
            }
        }
        return result;
    }
}
