package homework6;

public class ArreyUtilDemo {

    public static void main(String[] args) {
        int[] arrey = {2, 5, 8, 10, 88, 22, 11, 66, 12, 30, 6, 4, 3};
        ArreyUtil arreynum = new ArreyUtil();
        arreynum.maxOfArrey(arrey);
        arreynum.minOfArrey(arrey);
        arreynum.even(arrey);
        System.out.println();
        arreynum.odd(arrey);
        System.out.println();
        arreynum.evenmany(arrey);
        arreynum.oddmany(arrey);
    }
}
