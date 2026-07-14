
	package Collection.FunctionalInterface.Problem1;

	import java.util.ArrayList;
	import java.util.function.Function;

	public class Problem1 {

	    public static void main(String[] args) {

	        ArrayList<Employee> empList = new ArrayList<>();

	        empList.add(new Employee(101, "Rahul", "Pune", 25000));
	        empList.add(new Employee(102, "Amit", "Hyderabad", 30000));
	        empList.add(new Employee(103, "John", "Chennai", 28000));
	        empList.add(new Employee(104, "David", "Bangalore", 35000));
	        empList.add(new Employee(105, "Ravi", "Mumbai", 40000));

	        Function<ArrayList<Employee>, ArrayList<String>> fun = list -> {

	            ArrayList<String> locations = new ArrayList<>();

	            for (Employee e : list)
	                locations.add(e.getLocation());

	            return locations;
	        };

	        System.out.println(fun.apply(empList));
	    }
	}

