
	package Collection.Set;

	import java.util.Iterator;
	import java.util.TreeSet;

	public class Problem3 {

	    public static void main(String[] args) {

	        TreeSet<String> set = new TreeSet<>();

	        set.add("India");
	        set.add("USA");
	        set.add("Japan");
	        set.add("Australia");

	        // Reverse order
	        System.out.println("Reverse Order:");
	        Iterator<String> rev = set.descendingIterator();

	        while (rev.hasNext()) {
	            System.out.println(rev.next());
	        }

	        // Normal Iterator
	        System.out.println("\nAscending Order:");
	        Iterator<String> itr = set.iterator();

	        while (itr.hasNext()) {
	            System.out.println(itr.next());
	        }

	        // Search
	        String search = "India";

	        if (set.contains(search))
	            System.out.println("\n" + search + " exists.");
	        else
	            System.out.println("\n" + search + " not found.");
	    }
	}

