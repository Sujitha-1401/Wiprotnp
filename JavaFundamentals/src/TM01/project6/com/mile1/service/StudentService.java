package TM01.project6.com.mile1.service;



	import TM01.project6.com.mile1.bean.Student;

	public class StudentService {

	    // Count students whose marks array is null
	    public int findNumberOfNullMarksArray(Student[] s) {

	        int count = 0;

	        if (s != null) {
	            for (Student student : s) {
	                if (student != null && student.getMarks() == null) {
	                    count++;
	                }
	            }
	        }

	        return count;
	    }

	    // Count students whose name is null
	    public int findNumberOfNullName(Student[] s) {

	        int count = 0;

	        if (s != null) {
	            for (Student student : s) {
	                if (student != null && student.getName() == null) {
	                    count++;
	                }
	            }
	        }

	        return count;
	    }

	    // Count null student objects
	    public int findNumberOfNullObjects(Student[] s) {

	        int count = 0;

	        if (s != null) {
	            for (Student student : s) {
	                if (student == null) {
	                    count++;
	                }
	            }
	        }

	        return count;
	    }
	}

