// TASK CODEWARS
// https://www.codewars.com/kata/59f38b033640ce9fc700015b/train/java
package pl.jakubmarjankowski.codewars.SumOfPrimeIndexedElements;


public class Solution {
    public static int solve(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (isPrime(i)) sum += arr[i];
        }
        return sum;
    }

    public static boolean isPrime(int number) {

        int check = 0;

        if (number < 2) return false;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) check++;
        }
        if (check > 1)
            return false;
        return true;
    }
}