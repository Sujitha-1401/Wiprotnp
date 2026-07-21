package Junit.AssertMethodsandAnotations.problem2;



	import static org.junit.Assert.*;
	import org.junit.Test;

	public class TestCheckPresence {

	    @Test
	    public void testPresent() {
	        assertTrue(MyClass.checkPresence(new int[]{1, 2, 3, 4}, 3));
	    }

	    @Test
	    public void testAbsent() {
	        assertFalse(MyClass.checkPresence(new int[]{1, 2, 3, 4}, 10));
	    }
	}

