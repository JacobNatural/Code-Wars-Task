// TASK CODEWARS
// https://www.codewars.com/kata/546e2562b03326a88e000020/train/java
package pl.jakubmarjankowski.codewars.SquareEveryDigit;

public class SquareDigit {
    public int squareDigits(int n) {
        String result = "";
        String[] number = String.valueOf(n).split("");

        for(String s : number){
            int temp  = Integer.parseInt(s);
            result += temp * temp;
        }
        return Integer.parseInt(result);
    }
    public static void main(String[] args) {

    }
}
