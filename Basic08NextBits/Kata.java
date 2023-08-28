// TASK CODEWARS
// https://www.codewars.com/kata/56bdd0aec5dc03d7780010a5/train/java
package pl.jakubmarjankowski.codewars.Basic08NextBits;

public class Kata {
    public static int nextHigher(int n) {

        String binary = Integer.toBinaryString(n);
        int bits = countBits(binary);
        int returnBits = 0;
        while(bits != returnBits){
            n++;
            returnBits = countBits(Integer.toBinaryString(n));
        }
        return n;
    }
    public static int countBits(String binary){
        int bits = 0;
        for(int i = 0; i < binary.length(); i++){
            if(binary.charAt(i) == '1')bits++;
        }
        return bits;
    }

    public static void main(String[] args) {
       String p = Integer.toBinaryString(130);

        System.out.println(p);
    }
}
