// TASK CODEWARS
// https://www.codewars.com/kata/5a24254fe1ce0ec2eb000078/train/java

package pl.jakubmarjankowski.codewars.Simplestringindices;

public class Indice {
    public static int solve(String str, int index){
        int[] arrayOfIndex = {0,0};
        char[]  bracket = {'(', ')'};

        if(str.charAt(index) != bracket[0])return -1;

        for(int i = index; i < str.length(); i++){
            if(str.charAt(i) == bracket[0]){
                arrayOfIndex[0]++;
            }
            if(str.charAt(i) == bracket[1]){
                arrayOfIndex[1]++;
            }
            if(arrayOfIndex[0] == arrayOfIndex[1])
                return i;
        }
        return -1;
    }
}
