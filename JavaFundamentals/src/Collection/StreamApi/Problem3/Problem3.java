
	package Collection.StreamApi.Problem3;

	import java.util.ArrayList;

	public class Problem3 {

	    public static void main(String[] args) {

	        ArrayList<Student> list = new ArrayList<>();

	        list.add(new Student(1, "Rahul", 65));
	        list.add(new Student(2, "Amit", 40));
	        list.add(new Student(3, "John", 78));
	        list.add(new Student(4, "David", 55));
	        list.add(new Student(5, "Ravi", 30));

	        long count = list.stream()
	                .filter(s -> s.getMark() >= 50)
	                .count();

	        System.out.println("Students Passed = " + count);
	    }
	}

