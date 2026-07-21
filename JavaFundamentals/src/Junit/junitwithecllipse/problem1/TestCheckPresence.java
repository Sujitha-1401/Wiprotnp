package Junit.junitwithecllipse.problem1;



	import static org.junit.Assert.assertTrue;
	import org.junit.Test;

	public class TestCheckPresence {

	    @Test
	    public void testCheckPresence() {
	        DailyTask dt = new DailyTask();

	        assertTrue(dt.checkPresence("Welcome to Wipro", "Wipro"));
	    }
	}

