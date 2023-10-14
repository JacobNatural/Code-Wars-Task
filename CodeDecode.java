// TASK CODEWARS
// https://www.codewars.com/kata/5d98b6b38b0f6c001a461198/train/java
package pl.jakubmarjankowski.codewars.Binaries;

public class CodeDecode {
    public static String code(String string){
        String[] stringSplit = string.split("");
        String result = "", temp;
        for(String s : stringSplit){
            temp = Integer.toBinaryString(Integer.parseInt(s));
            if(temp.length() < 2){
                result += "1";
            }else {
                for(int i = 0; i < temp.length(); i++){
                    if(i < temp.length() - 1)
                        result += "0";
                    else result += "1";
                }
            }
            result += temp;
        }
        return result;
    }

    public static String decode(String str){
        String result = "";
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            count++;
            if(str.charAt(i) == '1') {
                if(i + count > str.length()) break;
                result += Integer.parseInt(str.substring(i + 1, i + count + 1), 2);
                i += count;
                count = 0;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        //code("0123456789");

        System.out.println(decode("0011110011110111011100011000"));
    }
}
