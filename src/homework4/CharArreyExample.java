package homework4;

public class CharArreyExample {

    public static void main(String[] args) {

        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int a = 0;
        for (int i = 0; i < chars.length; i++) {
            if (c == chars[i]) {
                a++;
                System.out.println(a);
            }
        }

        int b = chars.length / 2;
        int d = b - 1;
        System.out.println(chars[d] + " " + chars[b]);

        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        System.out.println(chars3[chars3.length - 2] + " " + chars3[chars3.length - 1]);

        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ')
                System.out.print(text[i] + " ");
        }
    }
}

