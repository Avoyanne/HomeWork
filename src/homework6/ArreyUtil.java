package homework6;

public class ArreyUtil {
    void maxOfArrey(int[] arrey) {
        int max = arrey[0];
        for (int i = 1; i < arrey.length; i++) {
            if (arrey[i] > max) {
                max = arrey[i];
            }
        }
        System.out.println(max);
    }

    void minOfArrey(int[] arrey) {
        int min = arrey[0];
        for (int i = 0; i < arrey.length; i++) {
            if (arrey[i] < min) {
                min = arrey[i];
            }
        }
        System.out.println(min);
    }

    void even(int[] arrey) {
        int even = arrey[0];
        for (int i = 0; i < arrey.length; i++) {
            if (arrey[i] % 2 == 0) {
                even = arrey[i];
                System.out.print(even + " ");
            }
        }
    }

    void odd(int[] arrey) {
        int odd = arrey[0];
        for (int i = 0; i < arrey.length; i++) {
            if (arrey[i] % 2 != 0) {
                odd = arrey[i];
                System.out.print(odd + " ");
            }
        }
    }

    void evenmany(int[] arrey) {
        int many = 0;
        for (int i = 0; i < arrey.length; i++) {
            if (arrey[i] % 2 == 0) {
                many++;
            }
        }
        System.out.println(many + " ");
    }

    void oddmany(int[] arrey) {
        int many = 0;
        for (int i = 0; i < arrey.length; i++) {
            if (arrey[i] % 2 != 0) {
                many++;
            }
        }
        System.out.println(many + " ");
    }
}
