package pl.jakubmarjankiwski.codewars.ParseHtmlColors;

public class RGB {
    public int r, g, b;

    public RGB(){

    }

    public RGB(int r, int g, int b){
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public static void main(String[] args) {
        String text = "77";
        int decimal = Integer.parseInt(text,16);
        System.out.println(decimal);
    }


}
