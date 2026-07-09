package Oops_Inheritance_StringAndStringBuffer;



	import java.util.*;
	public class AlternateCombine {
		public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        String a = sc.nextLine();
	        String b = sc.nextLine();

	        String result = "";

	        int min = Math.min(a.length(), b.length());

	        for (int i = 0; i < min; i++) {
	            result += a.charAt(i);
	            result += b.charAt(i);
	        }
	        if (a.length() > b.length()) {
	            result += a.substring(min);
	        } else {
	            result += b.substring(min);
	        }

	        System.out.println(result);
		}

	}


