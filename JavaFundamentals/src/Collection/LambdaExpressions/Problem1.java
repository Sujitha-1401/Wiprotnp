

	package Collection.LambdaExpressions;

	import java.util.ArrayList;

	public class Problem1 {

	    public static void main(String[] args) {

	        ArrayList<Integer> a1 = new ArrayList<>();

	        a1.add(2);
	        a1.add(5);
	        a1.add(8);
	        a1.add(11);
	        a1.add(15);
	        a1.add(17);
	        a1.add(20);
	        a1.add(23);
	        a1.add(27);
	        a1.add(29);
	        a1.add(31);
	        a1.add(34);
	        a1.add(37);
	        a1.add(40);
	        a1.add(41);
	        a1.add(43);
	        a1.add(47);
	        a1.add(50);
	        a1.add(53);
	        a1.add(59);
	        a1.add(61);
	        a1.add(67);
	        a1.add(70);
	        a1.add(73);
	        a1.add(79);

	        a1.forEach(n -> {
	            boolean prime = true;

	            if (n < 2)
	                prime = false;
	            else {
	                for (int i = 2; i <= Math.sqrt(n); i++) {
	                    if (n % i == 0) {
	                        prime = false;
	                        break;
	                    }
	                }
	            }

	            if (prime)
	                System.out.println(n);
	        });
	    }
	}

