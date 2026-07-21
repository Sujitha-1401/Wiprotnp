package Junit.TestSuite;


	import org.junit.runner.RunWith;
	import org.junit.runners.Suite;

	import Junit.AssertMethodsandAnotations.problem1.TestSort;
	import Junit.AssertMethodsandAnotations.problem2.TestCheckPresence;

	@RunWith(Suite.class)
	@Suite.SuiteClasses({
	    TestSort.class,
	    TestCheckPresence.class
	})

	public class TestSuite {

	}

