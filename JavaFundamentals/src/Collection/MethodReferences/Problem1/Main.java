
	package Collection.MethodReferences.Problem1;

	public class Main {
		 public static void main(String[] args) {

		        Factorial obj = new Factorial();

		        FactorialInterface fi = obj::factorial;

		        System.out.println("Factorial = " + fi.calculate(5));
		    }
	}

