// TASK CODEWARS
// https://www.codewars.com/kata/5efae11e2d12df00331f91a6/train/java
package pl.jakubmarjankowski.codewars.CrackthePIN;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.stream.Stream;

import static java.util.stream.IntStream.range;

public class CodeWars {
    public static String crack(String hash)  {

        MessageDigest md;
        byte[] messageDigest;
        String hashValue, pin = "";

        StringBuilder check = new StringBuilder();
        for(int a = 0; a <= 9; a++){
            for(int b = 0; b <= 9; b++){
                for(int c = 0; c <= 9; c++){
                    for(int d = 0; d <= 9; d++){
                        for(int e = 0; e <= 9; e++){
                            pin += ""+ a + b+ c+ d+ e;
                            try {
                                md = MessageDigest.getInstance("MD5");
                                messageDigest = md.digest(pin.getBytes());
                                BigInteger bigInteger = new BigInteger(1,messageDigest);
                                hashValue = bigInteger.toString(16);
                                while(hashValue.length() < 32)
                                    hashValue = "0" + hashValue;
                            if (hashValue.equals(hash)){
                                    return pin;
                                }
                            }catch (NoSuchAlgorithmException j) {
                                throw new RuntimeException(j);
                            }
                            pin = "";
                        }
                    }
                }
            }
        }
        return null;
    }
}
