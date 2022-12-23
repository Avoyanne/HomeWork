package homework;

public class FigurePainter {
    public static void main(String[] args) {
        //figure number 1
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println();

        //figure number 3
        for (int i = 0; i <= 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        //figure number 2
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j >i ; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}





