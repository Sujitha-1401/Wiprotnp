
	package Collection.StreamApi.Problem2;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.stream.Collectors;

	public class Problem2 {

	    public static void main(String[] args) {

	        ArrayList<Employee> list = new ArrayList<>();

	        list.add(new Employee(101, "Rahul", 25, "Pune"));
	        list.add(new Employee(102, "Amit", 28, "Hyderabad"));
	        list.add(new Employee(103, "John", 30, "Pune"));
	        list.add(new Employee(104, "David", 27, "Chennai"));
	        list.add(new Employee(105, "Ravi", 24, "Pune"));

	        List<Employee> puneEmployees = list.stream()
	                .filter(emp -> emp.getLocation().equalsIgnoreCase("Pune"))
	                .collect(Collectors.toList());

	        puneEmployees.forEach(System.out::println);
	    }
	}

