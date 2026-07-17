
	package LogicalBuilding.day3;

	import java.util.Scanner;

	public class IsEven {
		public static int isEven(int num) {
			if(num%2==0){
				return 2;
			}else {
				return 1;
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			System.out.println(isEven(num));

		}

	}

