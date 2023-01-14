package homework6;

public class ArreyUtilDemo {

    public static void main(String[] args) {
       int []arrey = { 2, 5, 8, 10, 88, 22, 11, 66, 12, 30, 6, 4, 3};
        ArreyUtil maxNum = new ArreyUtil();
        maxNum.maxOfArrey(arrey);
        maxNum.minOfArrey(arrey);
        maxNum.even(arrey);
        System.out.println();
        maxNum.odd(arrey);
        System.out.println();
        maxNum.evenmany(arrey);
        maxNum.oddmany(arrey);
    }
}
