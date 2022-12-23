package homework.homework2;

public class ArreyUtil {
    public static void main(String[] args) {
        int[] arrey = {34, 26, 11, 89, 66, 8, 99, 55, 14, 73};
//տպել բոլոր էլեմենտները
        for (int i = 0; i < arrey.length; i++) {
            System.out.print(arrey[i] + " ");
        }
        System.out.println();
        //տպել ամենամեծ թիվը
        int a = arrey[0];
        for (int i = 0; i < arrey.length; i++) {
            if (a < arrey[i]) {
                a = arrey[i];
            }
        }
        System.out.println(a);
        //տպել ամենափոքր թիվը
        int b = arrey[0];
        for (int i = 0; i <arrey.length; i++) {
            if (b > arrey[i]) {
                b=arrey[i];
            }
        }
        System.out.println(b);
    }
}
