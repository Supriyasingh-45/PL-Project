import java.util.*;

public class Employee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ID = 0;
        int age = 0;
        String name = "";
        String department = "";
        double salary = 0;
        String gender = "";

        boolean added = false;
        int choise;

        do {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add employee");
            System.out.println("2. View employee");
            System.out.println("3. Search employee");
            System.out.println("4. Delete employee");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choise = sc.nextInt();
            sc.nextLine();

            switch (choise) {

                case 1:
                    System.out.print("Enter employee ID: ");
                    ID = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter employee name: ");
                    name = sc.nextLine();

                    System.out.print("Enter employee age: ");
                    age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter employee gender: ");
                    gender = sc.nextLine();

                    System.out.print("Enter employee department: ");
                    department = sc.nextLine();

                    System.out.print("Enter employee salary: ");
                    salary = sc.nextDouble();
                    sc.nextLine();

                    added = true;

                    System.out.println("Employee added successfully!");
                    break;

                case 2:
                    if (added) {
                        System.out.println("\n----- Employee Details -----");
                        System.out.println("Employee ID: " + ID);
                        System.out.println("Employee Name: " + name);
                        System.out.println("Employee Age: " + age);
                        System.out.println("Employee Gender: " + gender);
                        System.out.println("Employee Department: " + department);
                        System.out.println("Employee Salary: " + salary);
                    } else {
                        System.out.println("No employee is available!");
                    }
                    break;

                case 3:
                    System.out.print("Enter employee ID to search: ");
                    int search = sc.nextInt();

                    if (search == ID && added) {
                        System.out.println("Employee found successfully!");
                        System.out.println("Employee Name: " + name);
                        System.out.println("Employee Department: " + department);
                    } else {
                        System.out.println("Employee not found!");
                    }
                    break;

                case 4:
                    if (added) {
                        added = false;
                        System.out.println("Employee deleted successfully!");
                    } else {
                        System.out.println("No employee available to delete!");
                    }
                    break;

                case 5:
                    System.out.println("Thank You!!!!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choise != 5);

        sc.close();
    }
}