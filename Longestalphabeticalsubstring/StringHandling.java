// TASK CODEWARS
// https://www.codewars.com/kata/5a7f58c00025e917f30000f1/train/java
package pl.jakubmarjankowski.codewars.Longestalphabeticalsubstring;

public class StringHandling {
    public static String longestAlpabeticalSubstring(String text) {
        String currentSubstring = "";
        String longestSubstring = "";
        currentSubstring += text.charAt(0);
        for(int i = 1; i < text.length(); i++){
            if(text.charAt(i) >= text.charAt(i - 1)){
                currentSubstring += text.charAt(i);
            }else {
                if(longestSubstring.length() < currentSubstring.length()) {
                    longestSubstring = currentSubstring;
                }
                currentSubstring = "";
                currentSubstring += text.charAt(i);
            }
        }
        return currentSubstring.length() > longestSubstring.length() ? currentSubstring : longestSubstring;
    }
    public static void main(String[] args) {
        longestAlpabeticalSubstring("acbcd");


    }
}
