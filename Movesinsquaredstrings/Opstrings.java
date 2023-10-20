// TASK CODEWARS
// https://www.codewars.com/kata/56dbf59b0a10feb08c000227/train/java
package pl.jakubmarjankowski.codewars.Movesinsquaredstrings;

public class Opstrings {
    public static String rot90Counter(String strng) {
        String[] strngSplit = strng.split("\n");
        String[] resultArray = new String[strngSplit.length];
        String result = "";
        for(int j = strngSplit[0].length() -1, k = 0; j >= 0; k++, j--) {
            resultArray[k] = "";
            for (int i = 0; i < strngSplit.length; i++) {
                resultArray[k] += strngSplit[i].charAt(j);
            }
        }
        for(String s : resultArray){
            result += s + "\n";
        }
        return result.trim();
    }
    public static String diag2Sym(String strng) {
        String[] strngSplit = strng.split("\n");
        String[] resultArray = new String[strngSplit.length];
        String result = "";
        for(int j = strngSplit[0].length() -1, k = 0; j >= 0; k++, j--) {
            resultArray[k] = "";
            for (int i = strngSplit.length - 1; i >= 0;i--) {
                resultArray[k] += strngSplit[i].charAt(j);
            }
        }
        for(String s : resultArray){
            result += s + "\n";
        }
                return result.trim();
    }
    public static String selfieDiag2Counterclock(String strng) {
        String diag2Sym = diag2Sym(strng);
        String rot90Counter = rot90Counter(strng);
        String[] splitStrng = strng.split("\n");
        String[] diag2SymSplit = diag2Sym.split("\n");
        String[] rot90CounterSplit = rot90Counter.split("\n");
        String result = "";
        for(int i = 0; i < splitStrng.length; i++){
            result += splitStrng[i] + "|" + diag2SymSplit[i] + "|"  + rot90CounterSplit[i] + "\n";
        }
        return result.trim();
    }
    public static String oper(Chose c , String s) {
        return  c.chose(s);
    }
}

interface Chose{
    public String chose(String s );
}
