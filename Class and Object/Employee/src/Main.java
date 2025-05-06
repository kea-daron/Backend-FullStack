import model.Employee;
import model.EmployeePosition;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

public class Main {
    private static final List<Employee> employees = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        while (true) {
            System.out.println("\n--- Employee Management ---");
            System.out.println("1. Add New Employee");
            System.out.println("2. Find Employee by ID");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Show All Employees");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
//            int option = scanner.nextInt();

            int option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1 -> addNew();
                case 2 -> findById();
                case 3 -> updateById();
                case 4 -> deleteById();
                case 5 -> showAll();
                case 0 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void addNew() {
        int id = employees.size() + 1;
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter profile: ");
        String profile = scanner.nextLine();
        System.out.print("Enter salary: ");
        BigDecimal salary = new BigDecimal(scanner.nextLine());
        System.out.print("Enter position (MANAGER, SALE, MARKETING): ");
        EmployeePosition position = EmployeePosition.valueOf(scanner.nextLine().toUpperCase());

        Employee employee = new Employee(id, UUID.randomUUID().toString(), name, email, profile, LocalDate.now(), salary, position);
        employees.add(employee);
        System.out.println("✅ Employee added successfully.");
    }

    private static void findById() {
        System.out.print("Enter ID to search: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Employee e : employees) {
            if (e.getId() == id) {
                System.out.println(e.toString());
                return;
            }
        }
        System.out.println("❌ Employee not found.");
    }

    private static void updateById() {
        System.out.print("Enter ID to update: ");
        int id = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                System.out.print("Enter new name: ");
                String name = scanner.nextLine();
                System.out.print("Enter new email: ");
                String email = scanner.nextLine();
                System.out.print("Enter new profile: ");
                String profile = scanner.nextLine();
                System.out.print("Enter new salary: ");
                BigDecimal salary = new BigDecimal(scanner.nextLine());
                System.out.print("Enter new position (MANAGER, SALE, MARKETING): ");
                EmployeePosition position = EmployeePosition.valueOf(scanner.nextLine().toUpperCase());

                Employee updated = new Employee(id, UUID.randomUUID().toString(), name, email, profile, LocalDate.now(), salary, position);
                employees.set(i, updated);
                System.out.println("✅ Employee updated successfully.");
                return;
            }
        }
        System.out.println("❌ Employee not found.");
    }

    public static void deleteById() {
        System.out.print("Enter ID to delete: ");
        int id = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                employees.remove(i);
                System.out.println("✅ Deleted successfully!");
                return;
            }
        }

        System.out.println("❌ Employee not found!");
    }


    private static void showAll() {
        if (employees.isEmpty()) {
            System.out.println("No employees to show.");
        } else {
            for (Employee e : employees) {
                System.out.println(e);
            }
        }
    }
}