package pl.jakubmarjankowski.codewars.FunWithTreesMaxSum;

public class TestyRekurencja {
    public static int sum(int number){
        if(number * 2 < 1000){
            number *=2;
            System.out.println(number);
            sum(number);
        }
       return 0;
    }
    public static void main(String[] args) {
        sum(3);
    }
}
