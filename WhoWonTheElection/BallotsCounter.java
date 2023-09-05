// TASK CODEWARS
// https://www.codewars.com/kata/554910d77a3582bbe300009c/train/java
package pl.jakubmarjankowski.codewars.WhoWonTheElection;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class BallotsCounter {
    public static String getWinner(final List<String> listOfBallots) {

        Map<String, Integer> map = new TreeMap<>();
        int max = 0;
        String result = "";

        for(String s : listOfBallots){
            if(map.containsKey(s)){
                int help = map.get(s);
                map.put(s, help + 1);
            }else {
                map.put(s, 1);
            }
        }
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() > max)
            result = entry.getKey();
                    max = Math.max(max, entry.getValue());
        }
        if(max > listOfBallots.size()/ 2){
            return result;
        }else {
            return null;
        }
    }
}
