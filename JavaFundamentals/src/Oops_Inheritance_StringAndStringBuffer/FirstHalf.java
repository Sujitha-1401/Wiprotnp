package Oops_Inheritance_StringAndStringBuffer;

	import java.util.Scanner;
	public class FirstHalf {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        Scanner sc = new Scanner(System.in);

	        String str = sc.nextLine();

	        if (str.length() % 2 == 0) {
	            System.out.println(str.substring(0, str.length() / 2));
	        } else {
	            System.out.println("null");
	        }


		}

	}

