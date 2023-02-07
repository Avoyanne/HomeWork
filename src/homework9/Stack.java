package homework9;

public class Stack {
    private char[] array = new char[10];
    private int size;
    public Stack(){
        size = -1;
    }
    public void push(char value){
        if (size == array.length){
            System.out.println("stack -ում տեղ չկա");
        } else array[++size] = value;
    }
    public char pop(){
        if (size < 0){
            System.out.println("stack -ում տեղ չկա");
            return 0;
        } else return array[size--];
    }
}
