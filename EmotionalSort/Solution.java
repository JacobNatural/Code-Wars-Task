// TASK CODEWARS
// https://www.codewars.com/kata/5a86073fb17101e453000258/train/java
package pl.jakubmarjankowski.codewars.EmotionalSort;

import java.util.*;

public class Solution {
    public static String[] sortEmotions(boolean order,String[] emotions) {

        List<Integer> numbersList = List.of(1,2,3,4,5);
        List<String> emotionsList = List.of(":D", ":)", ":|", ":(", "T_T");
        List<Integer> emotionsInInteger = new ArrayList<>();
        String[] resultString = new String[emotions.length];

        for(String s : emotions){
            for(int i = 0; i < emotionsList.size(); i++){
                if(s.equals(emotionsList.get(i))){
                    emotionsInInteger.add(numbersList.get(i));
                }
            }
        }
        if(order){
            Collections.sort(emotionsInInteger);
        }else {
            Collections.sort(emotionsInInteger, Collections.reverseOrder());
        }

        for(int j = 0; j < emotionsInInteger.size(); j++){
            for(int i = 0; i < numbersList.size(); i++){
                if(emotionsInInteger.get(j) == numbersList.get(i))
                    resultString[j] = emotionsList.get(i);
            }
        }
        return resultString;
    }
}
