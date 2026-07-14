package WrapperClasses;


	import java.util.*;
	public class Problem3 {
		public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number (1-255): ");
	        int num = sc.nextInt();

	        String binary = Integer.toBinaryString(num);
	        String result = String.format("%8s", binary).replace(' ', '0');

	        System.out.println(result);

		}

	}

