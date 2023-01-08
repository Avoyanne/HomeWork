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
        for (int i = 0; i < arrey.length; i++) {
            if (b > arrey[i]) {
                b = arrey[i];
            }
        }
        System.out.println(b);
//տպել միայն կենտ թվերը
        int c = arrey[0];
        for (int i = 0; i < arrey.length; i++) {
            if (arrey[i] % 2 != 0) {
                c = arrey[i];
                System.out.print(c + " ");
            }
        }
        System.out.println();
//տպել միայն զույգ թվերը
        int y = arrey[0];
        for (int i = 0; i < arrey.length; i++) {
            if (arrey[i] % 2 == 0) {
                y = arrey[i];
                System.out.print(y + " ");
            }

        }
        System.out.println();
//տպել զույգերի քանակը
        int v = 0;
        for (int i : arrey) {
            if (i % 2 == 0) {
                v++;
            }
        }
        System.out.println(v);
//տպել կենտերի քանակը
        int x = 0;
        for (int i : arrey) {
            if (i %2 != 0){
                x++;
            }
        }
        System.out.println(x);
    }
}
