// TASK CODEWARS
// https://www.codewars.com/kata/56cac350145912e68b0006f0/train/java
package pl.jakubmarjankowski.codewars.upANDdown;

import java.util.Locale;

public class Updown {
    public static String arrange(String strng) {

        String[] arrayStrng = strng.split(" ");
        String result = "";

        int check = 1;
        while(check > 0) {
            check = 0;
            for (int i = 0; i < arrayStrng.length - 1; i++) {
                String temp;
                if (i % 2 == 0) {
                    if (arrayStrng[i].length() > arrayStrng[i + 1].length()) {
                        temp = arrayStrng[i];
                        arrayStrng[i] = arrayStrng[i + 1];
                        arrayStrng[i + 1] = temp;
                        check++;
                    }
                } else {
                    if (arrayStrng[i].length() < arrayStrng[i + 1].length()) {
                        temp = arrayStrng[i];
                        arrayStrng[i] = arrayStrng[i + 1];
                        arrayStrng[i + 1] = temp;
                        check++;
                    }
                }
            }
        }

        for(int i = 0; i < arrayStrng.length; i++){
            if(i % 2 == 0){
                result += arrayStrng[i].toLowerCase(Locale.ROOT) + " ";
            }else {
                result += arrayStrng[i].toUpperCase(Locale.ROOT) + " ";
            }
        }
        return result.trim();
    }
}
