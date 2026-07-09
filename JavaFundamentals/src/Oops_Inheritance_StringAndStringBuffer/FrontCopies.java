package Oops_Inheritance_StringAndStringBuffer;

	import java.util.Scanner;
	public class FrontCopies {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
	        String str = sc.nextLine();

	        String front;

	        if (str.length() < 2) {
	            front = str;
	        } else {
	            front = str.substring(0, 2);
	        }

	        String result = "";

	        for (int i = 0; i < str.length(); i++) {
	            result += front;
	        }

	        System.out.println(result);

		}

	}

