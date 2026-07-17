
	package LogicalBuilding.day3;
	import java.util.*;

	public class SecondLastDigit {
		public static int secondLastDigit(int num) {
			num=Math.abs(num);
			if(num<10)
				return -1;
			return (num/10)%10;
		}
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			System.out.println(secondLastDigit(num));

		}

	}

