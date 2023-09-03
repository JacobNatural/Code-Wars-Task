// TASK CODEWARS
// https://www.codewars.com/kata/59e66e48fc3c499ec5000103/train/java
package pl.jakubmarjankowski.codewars.ArrayCombinations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Kata {
    public static int solve(final List<List<Integer>> data) {
        int result = 1;

        List<List<Integer>> notDuplicatedData = new ArrayList<>();

        for (List<Integer> list : data) {
            HashSet<Integer> hashSet = new HashSet<>(list);
            notDuplicatedData.add(new ArrayList<>(hashSet));
        }

        for (List<Integer> list : notDuplicatedData) {
            result *= list.size();
        }
        return result; // your code here
    }
}