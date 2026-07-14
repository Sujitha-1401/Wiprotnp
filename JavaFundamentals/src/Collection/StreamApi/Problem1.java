
	package Collection.StreamApi;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.stream.Collectors;

	public class Problem1 {

	    public static void main(String[] args) {

	        ArrayList<Integer> list = new ArrayList<>();

	        list.add(-2);
	        list.add(5);
	        list.add(-4);
	        list.add(7);
	        list.add(-8);
	        list.add(10);
	        list.add(-11);
	        list.add(-14);
	        list.add(15);
	        list.add(-18);

	        List<Integer> result = list.stream()
	                .filter(n -> n < 0 && n % 2 == 0)
	                .collect(Collectors.toList());

	        result.forEach(System.out::println);
	    }
	}

