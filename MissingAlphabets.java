//TASK CODE WARS
// https://www.codewars.com/kata/58a664bb586e986c940001d5/train/java
package pl.jakubmarjankowski.codewars.MissingAlphabet;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MissingAlphabets {
    static String find(final String text) {
        int max = 0;
        String alphabets = "abcdefghijklmnopqrstuvwxyz", result = "", textToCheck = text;
        String[] splitAlphabets = alphabets.split("");
        Map<String, Integer> mapOfAlphabetic = new HashMap<>();
        for(int i = 0; i < text.length(); i++){
            if(mapOfAlphabetic.containsKey(String.valueOf(text.charAt(i)))){
                int temp = mapOfAlphabetic.get(String.valueOf(text.charAt(i)));
                mapOfAlphabetic.put(String.valueOf(text.charAt(i)), temp + 1);
            }else {
                mapOfAlphabetic.put(String.valueOf(text.charAt(i)), 1);
            }
        }


        for(Map.Entry<String, Integer> entry : mapOfAlphabetic.entrySet()){
            max = Math.max(entry.getValue(), max);
        }

        while (max > 0){
        for(int i = 0; i < alphabets.length(); i++){
            if(textToCheck.contains(String.valueOf(alphabets.charAt(i)))){
                textToCheck = textToCheck.replaceFirst(String.valueOf(alphabets.charAt(i)), "");
            }else {
                result += alphabets.charAt(i);
            }
        }
        max--;
        }

        String[] resultArray = result.split("");
        Arrays.sort(resultArray);
        result = Arrays.toString(resultArray);
        return result.replaceAll("[, \\[\\]]","");
    }
}
