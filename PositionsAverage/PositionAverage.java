// TASK CODEWARS
// https://www.codewars.com/kata/59f4a0acbee84576800000af/train/java
package pl.jakubmarjankowski.codewars.PositionsAverage;

public class PositionAverage {
    public static double posAverage(String s) {
        String[] sInArray = s.split(", ");
        int total = (sInArray.length * ( sInArray.length - 1) * sInArray[0].length())/ 2;
        int index = 0;

        for(int i = 0; i < sInArray.length; ++i){
            for(int j = i + 1; j < sInArray.length; ++j){
                for(int k = 0; k < sInArray[i].length(); ++k){
                    if(sInArray[i].charAt(k) == sInArray[j].charAt(k)) index++;
                }
            }
        }
        double result = (index * 100.0) / total;
        return 0;
    }
}
