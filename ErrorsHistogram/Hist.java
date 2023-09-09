// TASK CODEWARS
// https://www.codewars.com/kata/59f44c7bd4b36946fd000052/train/java
package pl.jakubmarjankowski.codewars.ErrorsHistogram;

import java.util.List;

public class Hist {
    public static String hist(String s) {

        List<Character> listOfErrors = List.of('u', 'w', 'x', 'z' );
        int[] numbersOfErrors = {0, 0, 0, 0};
        String result = "";

        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < listOfErrors.size(); j++){
                if(s.charAt(i) == listOfErrors.get(j)) numbersOfErrors[j] += 1;
            }
        }

        for(int i = 0; i < listOfErrors.size(); i++){
            if(numbersOfErrors[i] > 0) {
                result += listOfErrors.get(i) + "  " + numbersOfErrors[i];
                if(numbersOfErrors[i] > 9){
                    result += "    ";
                }else {
                    result += "     ";
                }
                for (int j = 0; j < numbersOfErrors[i]; j++) {
                    result += "*";
                }
                if (i != listOfErrors.size() - 1 ) {
                    System.out.println(2);
                    result += "\r";
                }
            }
        }
        return result.trim();
    }
}
