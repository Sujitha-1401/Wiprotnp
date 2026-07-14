
	package Collection.List;
	import java.util.ArrayList;

	public class Problem4 {
		public static void main(String[] args) {

	        ArrayList<Number> list = new ArrayList<>();

	        list.add(10);
	        list.add(25.5);
	        list.add(34.78f);
	        list.add(100L);

	        for (Number n : list) {
	            System.out.println(n);
	        }
	    }

	}

