// TASK CODEWARS
// https://www.codewars.com/kata/55a5c82cd8e9baa49000004c/train/java
package pl.jakubmarjankowski.codewars.CountTheDivisibleNumbers;

public class Kata {
    public static long divisibleCount(long x, long y, long k) {
        long result = y / k - (x - 1) /k;
        if(x == 0 && y == 1)result ++;
        return result;
    }
}
