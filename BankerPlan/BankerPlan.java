// TASK CODEWARS
// https://www.codewars.com/kata/56445c4755d0e45b8c00010a/train/java
package pl.jakubmarjankowski.codewars.BankerPlan;

public class BankerPlan {
    public static boolean fortune(int f0, double p, int c0, int n, double i) {

        double percentInBank = p / 100;
        double percentOfInflation = i / 100;
        if(percentInBank == 0.0 && percentOfInflation == 0.0) n--;
        while (f0 > 0){
            f0 = (int) (f0 + (f0 * percentInBank) ) - c0;
            c0 = (int)(c0 + (c0 * percentOfInflation));
            n--;
            if(n <= 0) return true;
        }
        return false;
    }
}
