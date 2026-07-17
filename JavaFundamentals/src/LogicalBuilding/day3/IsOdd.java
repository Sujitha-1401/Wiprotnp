
	package LogicalBuilding.day3;
	import java.util.*;

	public class IsOdd {
		public static int isOdd(int num) {
			if(num%2!=0)
				return 2;
			else
				return 1;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			System.out.println(isOdd(num));

		}

	}

