package Collections.DataTimeApi;


	import java.time.LocalTime;

	public class Problem5 {

	    public static void main(String[] args) {

	        LocalTime current = LocalTime.now();
	        LocalTime after25Minutes = current.plusMinutes(25);

	        System.out.println("Current Time : " + current);
	        System.out.println("After 25 Minutes : " + after25Minutes);
	    }
	}

