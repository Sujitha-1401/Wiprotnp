
	package Collection.Set;

	import java.util.HashSet;
	import java.util.Iterator;

	public class Problem2 {

	    public static void main(String[] args) {

	        HashSet<String> employees = new HashSet<>();

	        employees.add("Tasleem");
	        employees.add("Rahul");
	        employees.add("Anjali");
	        employees.add("Kiran");

	        Iterator<String> itr = employees.iterator();

	        while (itr.hasNext()) {
	            System.out.println(itr.next());
	        }
	    }
	}

