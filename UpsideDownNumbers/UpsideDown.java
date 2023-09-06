// TASK CODEWARS
// https://www.codewars.com/kata/59f7597716049833200001eb/train/java
package pl.jakubmarjankowski.codewars.UpsideDownNumbers;

public class UpsideDown {
    public static int solve(int x, int y) {

        String numbers = "01698";
        int result = 0;

        for(int i = x; i < y; i++){
            int check = 0;
            String[] arr = String.valueOf(i).split("");
            for(int j = 0; j < arr.length; j++){
                if(!numbers.contains(arr[j])){
                    check++;
                    break;
                }
            }
            if(check == 0) {
                result += checkNumber(arr);
            }
        }
        return result;
    }

    public static int checkNumber(String[] number) {
        String middle = "018";
        if(number.length % 2 != 0) {
            if(!middle.contains(number[number.length / 2]))
                return 0;
        }
        for(int i = 0, j = number.length - 1; i < j; i++, j--){
            if(number[i].equals("0") ||
            number[i].equals("1") || number[i].equals("8")){
                if(!number[i].equals(number[j]))return 0;
            }
            if(number[i].equals("6")){
                if(!number[j].equals("9")) return 0;
             }
            if(number[i].equals("9")){
                if(!number[j].equals("6"))return 0;
            }
        }
        return 1;
    }
}
