// TASK CODEWARS
// https://www.codewars.com/kata/56dbeec613c2f63be4000be6/train/java
package pl.jakubmarjankowski.codewars.MovesInSquaredStrings;

public class Opstrings {
    public interface ChoseFuncion{
        String chose(String[] string);
    }

    public static String diag1Sym(String[] strng) {
        String result = "";
        int length = strng[0].length(), index = 0;
        while (index < length) {
            for (int i = 0; i < strng.length; i++) {
                result += strng[i].charAt(index);
            }
            result += "\n";
            index++;
        }
        return result.trim();
    }

    public static String rot90Clock(String[] strng) {
        String result = "";
        int length = strng[0].length(), index = 0;
        while (index < length) {
            for (int i = strng.length - 1; i >= 0; i--) {
                result += strng[i].charAt(index);
            }
            result += "\n";
            index++;
        }
        return result;
    }

    public static String selfieAndDiag1(String[] strng)
    {
        String result = "";
        String[] diag1Sum = diag1Sym(strng).split("\n");
        for(int i = 0; i < diag1Sum.length; i++){
            result += strng[i] + "|" + diag1Sum[i] + "\n";
        }
        return result;
    }
    public static String oper(ChoseFuncion operator, String s) {
        String[] arrayS = s.split("\n");
        return operator.chose(arrayS);
    }
}
