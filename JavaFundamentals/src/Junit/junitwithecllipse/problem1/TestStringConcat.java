package Junit.junitwithecllipse.problem1;



	import static org.junit.Assert.assertEquals;
	import org.junit.Test;

	public class TestStringConcat {

	    @Test
	    public void testDoStringConcat() {

	        DailyTask dt = new DailyTask();

	        String expected = "Hello World";
	        String actual = dt.doStringConcat("Hello", "World");

	        assertEquals(expected, actual);
	    }
	}

