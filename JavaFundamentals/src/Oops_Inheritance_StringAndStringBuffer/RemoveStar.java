package Oops_Inheritance_StringAndStringBuffer;


	import java.util.*;
	public class RemoveStar {
		public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        String str = sc.nextLine();

	        int index = str.indexOf('*');

	        String result = str.substring(0, index - 1) + str.substring(index + 2);

	        System.out.println(result);

	    }

	}

