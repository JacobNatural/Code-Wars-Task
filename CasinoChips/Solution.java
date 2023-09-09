// TASK CODEWARS
// https://www.codewars.com/kata/5e0b72d2d772160011133654/train/java
package pl.jakubmarjankowski.codewars.CasinoChips;

import java.util.Arrays;

public class Solution {
    public static int solve(int [] arr){
        int count = 0;
        boolean trueFalse = true;
        while(trueFalse){
            Arrays.sort(arr);
            if(arr[1] > 0 && arr[2] > 0){
                arr[1]--;
                arr[2]--;
                count++;
            }else {
                trueFalse = false;
            }
        }
        return count;
    }
}
