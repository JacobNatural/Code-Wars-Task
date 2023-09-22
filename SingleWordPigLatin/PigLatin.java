// TASK CODEWARS
// https://www.codewars.com/kata/558878ab7591c911a4000007/train/java
package pl.jakubmarjankowski.codewars.SingleWordPigLatin;

import java.util.Locale;

public class PigLatin {
    public static String translate(String str){
        String vowel = "aeiou", consonant = "", result = "";
        boolean check = true;
        str = str.toLowerCase(Locale.ROOT);

        if(vowel.contains(String.valueOf(str.charAt(0)))){
            str += "way";
            return str;
        }

        for(int i = 0; i < str.length(); i++){
            if(!vowel.contains(String.valueOf(str.charAt(i))) && check){
                consonant += str.charAt(i);
            }else {
                check = false;
            }
            if(!check){
                result += str.charAt(i);
            }
            if(!Character.isAlphabetic(str.charAt(i)))return null;
        }
        result += consonant + "ay";
        return result;
    }
}

