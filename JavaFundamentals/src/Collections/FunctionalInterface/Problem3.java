
	package Collections.FunctionalInterface;
	import java.util.ArrayList;
	import java.util.function.Predicate;

	public class Problem3 {

	    public static void main(String[] args) {

	        ArrayList<String> list = new ArrayList<>();

	        list.add("madam");
	        list.add("java");
	        list.add("level");
	        list.add("apple");
	        list.add("radar");
	        list.add("hello");
	        list.add("malayalam");
	        list.add("wipro");
	        list.add("refer");
	        list.add("orange");

	        Predicate<String> palindrome = s ->
	                s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());

	        list.stream()
	                .filter(palindrome)
	                .forEach(System.out::println);
	    }
	}

