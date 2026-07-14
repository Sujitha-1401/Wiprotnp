
	package Collection.FunctionalInterface.Problem4;

	import java.util.ArrayList;
	import java.util.function.Predicate;

	public class Problem4 {

	    public static void main(String[] args) {

	        ArrayList<Employee> list = new ArrayList<>();

	        list.add(new Employee(101, "Rahul", 9000));
	        list.add(new Employee(102, "Amit", 12000));
	        list.add(new Employee(103, "John", 8000));
	        list.add(new Employee(104, "David", 15000));
	        list.add(new Employee(105, "Ravi", 7000));

	        Predicate<Employee> salaryLessThan10000 =
	                e -> e.getSalary() < 10000;

	        list.stream()
	                .filter(salaryLessThan10000)
	                .forEach(e -> System.out.println(e.getName()));
	    }
	}

