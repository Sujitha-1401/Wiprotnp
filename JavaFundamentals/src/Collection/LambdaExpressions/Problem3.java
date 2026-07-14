
	package Collection.LambdaExpressions;
	import java.util.ArrayList;

	public class Problem3{

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

	        a1.forEach(str -> {
	            if (str.length() % 2 != 0)
	                System.out.println(str);
	        });
	    }
	}

