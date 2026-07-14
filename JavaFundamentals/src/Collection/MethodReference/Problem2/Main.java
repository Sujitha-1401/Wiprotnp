
	package Collection.MethodReference.Problem2;

	public class Main {
		 public static void main(String[] args) {

		        DigitInterface d = DigitCount::digitCount;

		        System.out.println("Digits = " + d.count(987654));
		    }

	}

