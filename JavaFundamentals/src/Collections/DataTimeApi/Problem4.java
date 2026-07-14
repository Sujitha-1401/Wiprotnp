
	package Collections.DataTimeApi;

	import java.time.Year;

	public class Problem4 {

	    public static void main(String[] args) {

	        Year year = Year.now();

	        if (year.isLeap()) {
	            System.out.println(year + " is a Leap Year");
	        } else {
	            System.out.println(year + " is Not a Leap Year");
	        }
	    }
	}

