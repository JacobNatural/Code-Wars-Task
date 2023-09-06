// TASK CODEWARS
// https://www.codewars.com/kata/5a2c22271f7f709eaa0005d3/train/java
package pl.jakubmarjankowski.codewars.SingleCharacterPalindromes;

public class Solution {
    public static String solve(String s){

        if(isPalindrome(s)) return "OK";
        StringBuilder stringBuilder = new StringBuilder(s);

        for(int i = 0; i < stringBuilder.length() ; i++){
            String temp = stringBuilder.toString();
            if(isPalindrome(stringBuilder.deleteCharAt(i).toString())){
                return "remove one";
            }
            stringBuilder = new StringBuilder(temp);
        }
        return  "not possible";
    }
    public static boolean isPalindrome(String s){
        for(int i = 0, j = s.length() - 1; i < j; i++, j--){
            if(s.charAt(i) != s.charAt(j)) return false;
        }
        return true;
    }
}
