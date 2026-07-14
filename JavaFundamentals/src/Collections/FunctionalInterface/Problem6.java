
	package Collections.FunctionalInterface;

	import java.util.ArrayList;
	import java.util.function.Consumer;

	public class Problem6 {

	    public static void main(String[] args) {

	        ArrayList<String> list = new ArrayList<>();

	        list.add("Java");
	        list.add("Python");
	        list.add("Wipro");
	        list.add("Talent");
	        list.add("Stream");
	        list.add("Consumer");
	        list.add("Lambda");
	        list.add("Apple");
	        list.add("Orange");
	        list.add("Programming");

	        Consumer<String> reverse = str -> {
	            String rev = new StringBuilder(str).reverse().toString();
	            list.set(list.indexOf(str), rev);
	        };

	        list.forEach(reverse);

	        System.out.println(list);
	    }
	}

