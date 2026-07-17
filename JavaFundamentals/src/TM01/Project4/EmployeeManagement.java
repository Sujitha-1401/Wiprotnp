
	package TM01.Project4;
	import java.util.Scanner;

	public class EmployeeManagement {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        EmployeeOperations operation = new EmployeeOperations();

	        int choice;

	        do {

	            System.out.println("Main Menu");
	            System.out.println("1. Add an Employee");
	            System.out.println("2. Display All");
	            System.out.println("3. Exit");

	            choice = sc.nextInt();

	            switch (choice) {

	                case 1:

	                    System.out.print("Enter Employee ID: ");
	                    int id = sc.nextInt();
	                    sc.nextLine();

	                    System.out.print("Enter Employee Name: ");
	                    String name = sc.nextLine();

	                    System.out.print("Enter Employee Age: ");
	                    int age = sc.nextInt();

	                    System.out.print("Enter Employee Salary: ");
	                    double salary = sc.nextDouble();

	                    Employee emp =
	                            new Employee(id, name, age, salary);

	                    operation.addEmployee(emp);

	                    break;

	                case 2:

	                    operation.displayEmployees();

	                    break;

	                case 3:

	                    System.out.println("Exiting the System");

	                    break;

	                default:

	                    System.out.println("Invalid Choice");
	            }

	        } while (choice != 3);

	        sc.close();
	    }
	}

