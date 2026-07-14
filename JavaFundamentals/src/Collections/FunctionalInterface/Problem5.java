
	package Collections.FunctionalInterface;

	import java.util.ArrayList;
	import java.util.function.Predicate;

	public class Problem5 {

	    public static void main(String[] args) {

	        ArrayList<Integer> list = new ArrayList<>();

	        list.add(0);
	        list.add(1);
	        list.add(2);
	        list.add(4);
	        list.add(7);
	        list.add(9);
	        list.add(16);
	        list.add(20);
	        list.add(25);
	        list.add(36);

	        Predicate<Integer> perfectSquare = n -> {
	            int root = (int) Math.sqrt(n);
	            return root * root == n;
	        };

	        list.stream()
	            .filter(perfectSquare)
	            .forEach(System.out::println);
	    }
	}

