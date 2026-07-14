
	package AbstractionPackages.InterfacesNewFeatures.problem2;

	public class LambdaDemo {
		 public static void main(String[] args) {

		        Test t1 = (a, b, c) -> a + b + c;

		        Test t2 = (a, b, c) -> a * b * c;

		        System.out.println("Addition = " + t1.myFunction(10, 20, 30));

		        System.out.println("Multiplication = " + t2.myFunction(10, 20, 30));
		    }

	}

