
	package TM01.project5.ArrayList;

	import java.util.ArrayList;

	public class ArrayLists {

	    public static ArrayList<String> performOperations(String s1, String s2) {

	        ArrayList<String> list = new ArrayList<>();

	        // 1. Replace alternate characters of S1 with S2
	        StringBuilder op1 = new StringBuilder();
	        for (int i = 0; i < s1.length(); i++) {
	            if (i % 2 == 0)
	                op1.append(s2);
	            else
	                op1.append(s1.charAt(i));
	        }
	        list.add(op1.toString());

	        // 2. Replace last occurrence of S2 with reverse(S2) if S2 occurs >1 time
	        int first = s1.indexOf(s2);
	        int last = s1.lastIndexOf(s2);

	        if (first != -1 && first != last) {
	            String rev = new StringBuilder(s2).reverse().toString();
	            String op2 = s1.substring(0, last) + rev + s1.substring(last + s2.length());
	            list.add(op2);
	        } else {
	            list.add(s1 + s2);
	        }

	        // 3. Delete first occurrence of S2 if it occurs more than once
	        if (first != -1 && first != last) {
	            String op3 = s1.substring(0, first) + s1.substring(first + s2.length());
	            list.add(op3);
	        } else {
	            list.add(s1);
	        }

	        // 4. Divide S2 into two halves
	        int mid;
	        if (s2.length() % 2 == 0)
	            mid = s2.length() / 2;
	        else
	            mid = s2.length() / 2 + 1;

	        String firstHalf = s2.substring(0, mid);
	        String secondHalf = s2.substring(mid);

	        list.add(firstHalf + s1 + secondHalf);

	        // 5. Replace all characters in S1 that are present in S2 with '*'
	        StringBuilder op5 = new StringBuilder(s1);
	        for (int i = 0; i < op5.length(); i++) {
	            if (s2.indexOf(op5.charAt(i)) != -1)
	                op5.setCharAt(i, '*');
	        }
	        list.add(op5.toString());

	        return list;
	    }

	    public static void main(String[] args) {

	        String s1 = "JAVAJAVA";
	        String s2 = "VA";

	        ArrayList<String> result = performOperations(s1, s2);

	        System.out.println(result);
	    }
	}

