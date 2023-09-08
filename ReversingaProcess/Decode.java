// TASK CODEWARS
// https://www.codewars.com/kata/5dad6e5264e25a001918a1fc/train/java

package pl.jakubmarjankowski.codewars.ReversingaProcess;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Decode {
    public static String decode(String r) {

        StringBuilder result = new StringBuilder();
        String [] arr = r.split("(?<=\\d)(?=\\D)");
        List<Integer> checkNumber = new ArrayList<>();

        for(int i = 0; i < 26; i++){
            checkNumber.add(i * Integer.parseInt(arr[0]) % 26);
        }
        Collections.sort(checkNumber);
        for(int i = 0; i < 26; i++){
            if(i != checkNumber.get(i)) return "Impossible to decode";
        }

        for(int i = 0; i < arr[1].length(); i++){
              result.append(findSign(arr[1].charAt(i), Integer.parseInt(arr[0])));
        }
        return result.toString();
    }

    public static char findSign(char sign, int number){
        for(int i = 0; i < 26; i++){
            int signNumber = sign - 97;
            if(i * number % 26 == signNumber){
                char newSign = (char) (i + 97);
                return newSign;
            }
        }
        return 0;
    }
}

