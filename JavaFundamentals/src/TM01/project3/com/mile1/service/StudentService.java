
	package TM01.project3.com.mile1.service;
	import TM01.project3.com.mile1.bean.Student;

	public class StudentService {

	    public int findNumberOfNullMarksArray(Student s[]) {

	        int count = 0;

	        if (s != null) {

	            for (Student st : s) {

	                if (st != null && st.getMarks() == null)
	                    count++;
	            }
	        }

	        return count;
	    }

	    public int findNumberOfNullName(Student s[]) {

	        int count = 0;

	        if (s != null) {

	            for (Student st : s) {

	                if (st != null && st.getName() == null)
	                    count++;
	            }
	        }

	        return count;
	    }

	    public int findNumberOfNullObjects(Student s[]) {

	        int count = 0;

	        if (s != null) {

	            for (Student st : s) {

	                if (st == null)
	                    count++;
	            }
	        }

	        return count;
	    }

	}

