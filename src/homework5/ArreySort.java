package homework5;

public class ArreySort {

    public static void main(String[] args) {
        int[] numbers = {45, 55, 5, -9, 0, 12, 5, 65};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int a = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = a;
                }
            }
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] < numbers[j]) {
                    int a = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = a;
                }
            }
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}