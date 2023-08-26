// TASK CODEWARS
//https://www.codewars.com/kata/59daf400beec9780a9000045/train/java
package pl.jakubmarjankowski.codewars.WhatsANameIn;

public class Kata {
    public static boolean nameInStr(String str, String name){
        for(int i  = 0, j = 0; i < str.length(); i++){
            if(Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(name.charAt(j))){
                j++;
            }
            if(j == name.length())return true;
        }
        return false;
    }
}
