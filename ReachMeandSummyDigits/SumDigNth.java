// TASK CODEWARS
// https://www.codewars.com/kata/55ffb44050558fdb200000a4/train/java
package pl.jakubmarjankowski.codewars.ReachMeandSummyDigits;

public class SumDigNth {
    public static long sumDigNthTerm(long initval, long[] patternl, int nthterm) {

        long sum = 0, sumDig, multipler, rest, result = 0;
        String[] temporary;

        for(int i = 0; i < patternl.length; i++){
            sum += patternl[i];
        }

        multipler = (nthterm - 1) / patternl.length;
        sumDig = multipler * sum + initval;
        rest = (nthterm - 1) % patternl.length;

        for(int i = 0; i < rest; i++){
            sumDig += patternl[i];
        }

        temporary = String.valueOf(sumDig).split("");

        for(String s : temporary){
            result += Long.parseLong(s);
        }

        return result;
    }
}
