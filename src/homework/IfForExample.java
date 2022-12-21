package homework;

public class IfForExample {
    public static void main(String[] args) {
        int a, b;
    // տնային աշխատանք համար 1
        a = 22;
        b = 33;
        if (a < b) {
            System.out.println("max:" + " " + b);
            for (a = 22; a <= 33; a++)
                System.out.print(a + " ");
        }
        System.out.println();

    //տնային աշխատանք համար 2
        a = (char) a;
        System.out.println('a');
        b = (char) b;
        System.out.println('b');

    //տնային աշխատանք համար 3
        if (a == b) {
            System.out.println("a-հավասար է b-ին");
        } else {
            System.out.println("a-ն հավասար չէ b-ին");

        }

    }
}