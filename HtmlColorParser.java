package pl.jakubmarjankiwski.codewars.ParseHtmlColors;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class HtmlColorParser {
    private final Map<String, String> presetColors;

    public HtmlColorParser(Map<String, String> presetColors) {
        this.presetColors = presetColors;
    }

    public RGB parse(String color) {

        String colorToSend = "";
        int[] colorRgb;

        if(color.charAt(0) != '#'){
            color = presetColors.get(color.toLowerCase(Locale.ROOT));
        }
        if(color.length() == 4){
            colorToSend += "#";
            for(int i = 1; i < color.length(); i++){
                colorToSend += color.charAt(i);// + color.charAt(i);
                colorToSend += color.charAt(i);
            }
            color = colorToSend;
        }
       colorRgb = rgb(color.substring(1));
        return new RGB(colorRgb[0], colorRgb[1], colorRgb[2]);
    }
    public static int[] rgb(String color){
        int[] colorRgb = new int[3];
        for(int i = 0, j = 0; i < color.length(); i +=2, j++){
            colorRgb[j] = Integer.parseInt(color.substring(i ,i +2), 16);
        }
        return colorRgb;
    }

    public static void main(String[] args) {
        HtmlColorParser htmlColorParser = new HtmlColorParser();
      //  rgb("80FFA0");
        htmlColorParser.parse("#3B7");


    }
}
