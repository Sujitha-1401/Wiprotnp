
	package Collection.List.Problem2;
	public class EmployeeMain {

	    public static void main(String[] args) {

	        EmployeeDB db = new EmployeeDB();

	        db.addEmployee(new Employee(101, "Tasleem", "tasleem@gmail.com", "Female", 50000));
	        db.addEmployee(new Employee(102, "Rahul", "rahul@gmail.com", "Male", 45000));

	        db.showAllEmployees();

	        System.out.println(db.showPaySlip(101));

	        db.deleteEmployee(102);

	        System.out.println("\nAfter Deletion");
	        db.showAllEmployees();
	    }
	}

