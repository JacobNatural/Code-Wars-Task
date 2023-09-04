// TASK CODEWARS
// https://www.codewars.com/kata/536950ffc8a5ca9982001371/train/java
package pl.jakubmarjankowski.codewars.FrogJumping;

import java.util.ArrayList;
import java.util.List;

public class FrogJumping {
    public static int solution(int[] a) {

        int index = 0, counter = 0;
        List<Integer> doubleMoveCheck = new ArrayList<>();

        while(!doubleMoveCheck.contains(index)){

            doubleMoveCheck.add(index);
            if(index > a.length -1 || index < 0) return counter;
            counter++;
            index += a[index];
        }
        return -1;
    }
}

