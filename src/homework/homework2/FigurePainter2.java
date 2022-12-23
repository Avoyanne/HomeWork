package homework.homework2;

public class FigurePainter2 {
    public static void main(String[] args) {
        //figure num1
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <=3; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        //figure num2
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = -1; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < 3; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
