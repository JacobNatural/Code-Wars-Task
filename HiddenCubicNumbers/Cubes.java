// TASK CODEWARS
// https://www.codewars.com/kata/55031bba8cba40ada90011c4/solutions/java
package pl.jakubmarjankowski.codewars.HiddenCubicNumbers;

import java.util.ArrayList;
import java.util.List;

public class Cubes {
    public static String isSumOfCubes(String s) {

        String help = "";
        List<String> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        String stringResult = "";
        int totalSum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                help += s.charAt(i);
                if (help.length() >= 3) {
                    list.add(help);
                    help = "";
                }
                if (i == s.length() - 1 && help.length() > 0) list.add(help);
            } else {
                if (help.length() > 0) {
                    list.add(help);
                    help = "";
                }
            }
        }
        for (String i : list) {
            System.out.println(i + " t");
            String[] p = i.split("");
            int pom = 0;
            for (String st : p) {
                System.out.println(st);
                pom += Math.pow(Integer.parseInt(st), 3);
                if (String.valueOf(pom).equals(i)) {
                    result.add(pom);
                }
            }
        }
        if (result.isEmpty()) return "Unlucky";
        for (Integer i : result) {
            stringResult += i + " ";
            totalSum += i;
        }
        stringResult += totalSum + " Lucky";
        return stringResult;
    }
}
