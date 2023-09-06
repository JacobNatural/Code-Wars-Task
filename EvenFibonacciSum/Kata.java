// TASK CODEWARS
// https://www.codewars.com/kata/55688b4e725f41d1e9000065/train/java
package pl.jakubmarjankowski.codewars.EvenFibonacciSum;

public class Kata {
    public static long fibonacci(long max) {
        long a = 0, b = 1, temp, sum = 0;
        while(b < max){
            temp = a;
            a = b;
            b = temp + b;
            if(a % 2 == 0) sum += a;
        }
        return sum;
    }
}
