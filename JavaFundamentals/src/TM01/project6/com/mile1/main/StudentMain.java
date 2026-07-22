package TM01.project6.com.mile1.main;



	import TM01.project6.com.mile1.bean.Student;
	import TM01.project6.com.mile1.exception.NullMarksArrayException;
	import TM01.project6.com.mile1.exception.NullNameException;
	import TM01.project6.com.mile1.exception.NullStudentObjectException;
	import TM01.project6.com.mile1.service.StudentReport;
	import TM01.project6.com.mile1.service.StudentService;

	public class StudentMain {

	    public static void main(String[] args) {

	        Student data[] = new Student[5];

	        data[0] = new Student("Sekar", new int[] {85, 75, 95});
	        data[1] = new Student(null, new int[] {11, 22, 33});
	        data[2] = null;
	        data[3] = new Student("Manoj", null);
	        data[4] = new Student("Anu", new int[] {95, 85, 75});

	        StudentReport report = new StudentReport();

	        for (int i = 0; i < data.length; i++) {

	            try {
	                report.validate(data[i]);
	                String grade = report.findGrades(data[i]);
	                System.out.println(data[i].getName() + " Grade : " + grade);

	            } catch (NullStudentObjectException e) {
	                System.out.println(e);

	            } catch (NullNameException e) {
	                System.out.println(e);

	            } catch (NullMarksArrayException e) {
	                System.out.println(e);
	            }
	        }

	        StudentService service = new StudentService();

	        System.out.println("Null Objects : "
	                + service.findNumberOfNullObjects(data));

	        System.out.println("Null Names : "
	                + service.findNumberOfNullName(data));

	        System.out.println("Null Marks Array : "
	                + service.findNumberOfNullMarksArray(data));
	    }
	}

