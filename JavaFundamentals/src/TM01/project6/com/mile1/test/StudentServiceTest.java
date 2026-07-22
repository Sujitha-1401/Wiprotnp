package TM01.project6.com.mile1.test;


	import static org.junit.Assert.assertEquals;

	import org.junit.Before;
	import org.junit.Test;

	import TM01.project6.com.mile1.bean.Student;
	import TM01.project6.com.mile1.service.StudentService;

	public class StudentServiceTest {

	    StudentService service;
	    Student[] students;

	    @Before
	    public void setUp() {

	        service = new StudentService();

	        students = new Student[5];

	        students[0] = new Student("Ram", new int[] {80, 90, 85});
	        students[1] = new Student(null, new int[] {70, 80, 90});
	        students[2] = null;
	        students[3] = new Student("John", null);
	        students[4] = new Student("Anu", new int[] {60, 70, 80});
	    }

	    // TC7 - Null Name
	    @Test
	    public void testFindNumberOfNullName() {
	        assertEquals(1, service.findNumberOfNullName(students));
	    }

	    // TC8 - Null Student Object
	    @Test
	    public void testFindNumberOfNullObjects() {
	        assertEquals(1, service.findNumberOfNullObjects(students));
	    }

	    // TC9 - Null Marks Array
	    @Test
	    public void testFindNumberOfNullMarksArray() {
	        assertEquals(1, service.findNumberOfNullMarksArray(students));
	    }
	}

