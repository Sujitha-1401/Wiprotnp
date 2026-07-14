
	package Collection.LambdaExpressions;
	import java.util.ArrayList;
	import java.util.Collections;

	public class Problem2 {

	    public static void main(String[] args) {

	        ArrayList<String> a1 = new ArrayList<>();

	        a1.add("Apple");
	        a1.add("Banana");
	        a1.add("Orange");
	        a1.add("Mango");
	        a1.add("Grapes");
	        a1.add("Cherry");
	        a1.add("Papaya");
	        a1.add("Guava");
	        a1.add("Kiwi");
	        a1.add("Peach");

	        Collections.reverse(a1);

	        a1.forEach(s -> System.out.println(s));
	    }
	}

