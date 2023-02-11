package employee;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        EmployeeStorage ob = new EmployeeStorage();
        Scanner scanner = new Scanner(System.in);
        boolean isRun = true;
        while (isRun) {
            System.out.println("0 for exit");
            System.out.println("1 add employee");
            System.out.println("2 print oll employee");
            System.out.println("3 search employee by employeeID");
            System.out.println("4 search employee by company name");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("please input name");
                    String name = scanner.nextLine();
                    System.out.println("please input username");
                    String username = scanner.nextLine();
                    System.out.println("please input employeeID");
                    String employeeID = scanner.nextLine();
                    System.out.println("please input salary");
                    String salaryStr = scanner.nextLine();
                    System.out.println("please input company");
                    String company = scanner.nextLine();
                    System.out.println("please input position");
                    String position = scanner.nextLine();
                    double salary = Double.parseDouble(salaryStr);
                    Employee employee = new Employee(name, username, employeeID, salary, company, position);
                    ob.add(employee);
                    break;
                case "2":
                    ob.print();
                    break;
                case "3":
                    System.out.println("please input keyword");
                    String keyword = scanner.nextLine();
                    ob.searchbyEmployeeID(keyword);
                    break;
                case "4":
                    System.out.println("please input keyword");
                    String compname = scanner.nextLine();
                    ob.searchbycompany(compname);
                    break;
                default:
                    System.out.println("wrong command,please try again");
            }
        }
    }
}
