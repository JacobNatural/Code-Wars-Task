// TASK CODEWARS
// https://www.codewars.com/kata/55be10de92aad5ef28000023/train/java
package pl.jakubmarjankowski.codewars.ColorChoice;

import java.math.BigInteger;

public class CheckChoose {
    public static long checkchoose(long m, int n) {

        BigInteger bigIntegerN = new BigInteger(String.valueOf(n));
        BigInteger bigIntegerK;
        BigInteger result;
        for(long i = 1; i < n; i++){
           bigIntegerK = new BigInteger(String.valueOf(i));
           result = (strong(n)).divide(strong(i).multiply(strong(n - i)));
           if(result.longValue() == m) return i;
;        }
        return -1;
    }

    public static BigInteger strong(long n){
       BigInteger firstNumber = new BigInteger("1");
        BigInteger secondNumber = new BigInteger("2");
        for(int i = 1; i < n; i++){
            firstNumber = firstNumber.multiply(secondNumber);
            secondNumber = secondNumber.add(new BigInteger("1"));
        }
        return firstNumber;
    }
}
