import java.util.*;

public class EmployeeManagement {

    static class Employee {
        int employeeId;
        String name;
        String position;
        double salary;

        Employee(int employeeId, String name, String position, double salary) {
            this.employeeId = employeeId;
            this.name = name;
            this.position = position;
            this.salary = salary;
        }

        public String toString() {
            return employeeId + " | " + name + " | " + position + " | ₹" + salary;
        }
    }

    static Employee[] employees = new Employee[100];
    static int count = 0;

    public static void addEmployee(Scanner sc) {
        if (count >= employees.length) {
            System.out.println("Employee array is full.");
            return;
        }
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Position: ");
        String position = sc.nextLine();
        System.out.print("Salary: ");
        double salary = sc.nextDouble();
        employees[count++] = new Employee(id, name, position, salary);
        System.out.println("Employee added.");
    }

    public static void searchEmployee(Scanner sc) {
        System.out.print("Enter employee ID to search: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                System.out.println(employees[i]);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void displayEmployees() {
        if (count == 0) {
            System.out.println("No employees to display.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println(employees[i]);
            }
        }
    }

    public static void deleteEmployee(Scanner sc) {
        System.out.print("Enter employee ID to delete: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                System.out.println("Employee deleted.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add\n2. Search\n3. Display\n4. Delete\n5. Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1: addEmployee(sc); break;
                case 2: searchEmployee(sc); break;
                case 3: displayEmployees(); break;
                case 4: deleteEmployee(sc); break;
                case 5: return;
                default: System.out.println("Invalid choice.");
            }
        }
    }
}
