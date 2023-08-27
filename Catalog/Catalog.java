//TASK CODEWARS
// https://www.codewars.com/kata/59d9d8cb27ee005972000045/solutions/java
package pl.jakubmarjankowski.codewars.Catalog;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Catalog {
    public static String catalog(String s, String article) {
        String[] arrayArticle = s.split("\n\n");
        String result = "";
        Pattern pattern;
        Matcher matcher;

        for(String string : arrayArticle){
            if(string.contains(article)){
                pattern = Pattern.compile("<prod><name>(.*)</name><prx>(.*)</prx><qty>(.*)</qty></prod>");
                matcher = pattern.matcher(string);
                matcher.matches();
                result += matcher.group(1) + " > prx: $" +
                        matcher.group(2) + " qty: " + matcher.group(3) +"\n";
            }
        }
        if(result.length() == 0)return "Nothing";
        return result.trim();
    }
}