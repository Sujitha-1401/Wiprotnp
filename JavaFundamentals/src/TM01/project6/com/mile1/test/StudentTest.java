package TM01.project6.com.mile1.test;



	import static org.junit.Assert.assertEquals;

	import org.junit.Before;
	import org.junit.Test;

	import TM01.project6.com.mile1.bean.Student;
	import TM01.project6.com.mile1.exception.NullMarksArrayException;
	import TM01.project6.com.mile1.exception.NullNameException;
	import TM01.project6.com.mile1.exception.NullStudentObjectException;
	import TM01.project6.com.mile1.service.StudentReport;

	public class StudentTest {

	    StudentReport report;

	    @Before
	    public void setUp() {
	        report = new StudentReport();
	    }

	    // TC1 - Grade A
	    @Test
	    public void testGradeA() {
	        Student s = new Student("Ram", new int[] {80, 85, 75});
	        assertEquals("A", report.findGrades(s));
	    }

	    // TC2 - Grade D
	    @Test
	    public void testGradeD() {
	        Student s = new Student("Sam", new int[] {50, 45, 40});
	        assertEquals("C", report.findGrades(s));
	    }

	    // TC3 - Grade F
	    @Test
	    public void testGradeF() {
	        Student s = new Student("Tom", new int[] {10, 60, 70});
	        assertEquals("F", report.findGrades(s));
	    }

	    // TC4 - Null Student Object
	    @Test(expected = NullStudentObjectException.class)
	    public void testNullStudentObject()
	            throws NullStudentObjectException,
	                   NullNameException,
	                   NullMarksArrayException {

	        report.validate(null);
	    }

	    // TC5 - Null Name
	    @Test(expected = NullNameException.class)
	    public void testNullName()
	            throws NullStudentObjectException,
	                   NullNameException,
	                   NullMarksArrayException {

	        Student s = new Student(null, new int[] {50, 60, 70});
	        report.validate(s);
	    }

	    // TC6 - Null Marks Array
	    @Test(expected = NullMarksArrayException.class)
	    public void testNullMarks()
	            throws NullStudentObjectException,
	                   NullNameException,
	                   NullMarksArrayException {

	        Student s = new Student("John", null);
	        report.validate(s);
	    }
	}

