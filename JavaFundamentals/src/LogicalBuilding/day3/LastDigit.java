
	package LogicalBuilding.day3;
	import java.util.Scanner;

	public class LastDigit {
		public static int lastDigit(int num) {
			return Math.abs(num%10);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			System.out.println(lastDigit(num));
			

		}

	}

