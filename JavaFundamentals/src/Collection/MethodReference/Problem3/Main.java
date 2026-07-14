
	package Collection.MethodReference.Problem3;

	public class Main {
		 public static void main(String[] args) {

		        PrimeInterface p = Prime::new;

		        p.check(17);
		        p.check(18);
		    }
	}

