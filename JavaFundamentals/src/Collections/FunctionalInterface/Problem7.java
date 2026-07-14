
	package Collections.FunctionalInterface;

	import java.util.ArrayList;
	import java.util.function.Consumer;

	public class Problem7 {

	    public static void main(String[] args) {

	        ArrayList<Integer> list = new ArrayList<>();

	        list.add(2);
	        list.add(5);
	        list.add(8);
	        list.add(11);
	        list.add(14);
	        list.add(17);
	        list.add(20);
	        list.add(23);
	        list.add(26);
	        list.add(29);

	        Consumer<Integer> display = n -> {
	            if (n % 2 == 0)
	                System.out.println(n + " even");
	            else
	                System.out.println(n + " odd");
	        };

	        list.forEach(display);
	    }
	}

