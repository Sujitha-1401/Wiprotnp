
	package Collection.List;

	import java.util.Enumeration;
	import java.util.Iterator;
	import java.util.Vector;
	import Collection.List.Problem2.Employee;

	public class Problem7 {

	    public static void main(String[] args) {

	        Vector<Employee> employees = new Vector<>();

	        employees.add(new Employee(101, "Tasleem", "tasleem@gmail.com", "Female", 50000));
	        employees.add(new Employee(102, "Rahul", "rahul@gmail.com", "Male", 45000));

	        System.out.println("Using Iterator");

	        Iterator<Employee> itr = employees.iterator();

	        while (itr.hasNext()) {
	            itr.next().getEmployeeDetails();
	            System.out.println();
	        }

	        System.out.println("Using Enumeration");

	        Enumeration<Employee> en = employees.elements();

	        while (en.hasMoreElements()) {
	            en.nextElement().getEmployeeDetails();
	            System.out.println();
	        }
	    }
	}

