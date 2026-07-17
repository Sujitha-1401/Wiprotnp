
	package LogicalBuilding.day2.conditional;
	import java.util.*;

	public class GreaterNumber {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();

	        if (a > b) {
	            System.out.println(a);
	        } else if (b > a) {
	            System.out.println(b);
	        } else {
	            System.out.println("Both are Equal");
	        }

		}

	}

