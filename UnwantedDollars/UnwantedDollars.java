// TASK CODEWARS
// https://www.codewars.com/kata/587309155cfd6b9fb60000a0/train/java
package pl.jakubmarjankowski.codewars.UnwantedDollars;

public class UnwantedDollars {
    public static double moneyValue(String money){
        money = money.replaceAll("[\\$\s]", "");
        if(money.isEmpty() || !Character.isDigit(money.charAt(0))
                && money.length() == 1) return 0.0;
        return Double.parseDouble(money);
    }
}
