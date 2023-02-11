package employee;

public class EmployeeStorage {
    private Employee[] array = new Employee[10];

    private int size = 0;

    public void add(Employee value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }


    private void extend() {
        Employee[] newArray = new Employee[array.length + 10];
        for (int i = 0; i < size; i++) {
            array[i] = newArray[i];
        }
        array = newArray;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }

    public void searchbyEmployeeID(String keyword) {
        boolean found = true;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getEmployeeID().equals(keyword)) {
                found = true;
                System.out.println(employee);
            }
            if (!found) {
                System.out.println("employeeID with " + keyword + " not found");
            }
        }
    }

    public void searchbycompany(String compname) {
        boolean found = true;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getCompany().equals(compname)){
                found = true;
                System.out.println(employee);
            }
            if (!found){
                System.out.println("Company with " + compname + " not found");
            }
        }
    }
}
