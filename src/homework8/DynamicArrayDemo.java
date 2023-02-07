package homework8;

public class DynamicArrayDemo {

    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.add(6);
        da.add(54);
        da.add(12);
        da.add(37);
        System.out.println(da.getByInde(11));
        da.deleteByIndex(-1);
        da.add(1,66);
        da.print();

    }
}
