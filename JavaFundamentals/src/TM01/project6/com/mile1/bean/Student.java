package TM01.project6.com.mile1.bean;



	public class Student {

	    private String name;
	    private int[] marks;
	    private String grade;

	    // Default Constructor
	    public Student() {

	    }

	    // Parameterized Constructor
	    public Student(String name, int[] marks) {
	        this.name = name;
	        this.marks = marks;
	    }

	    // Getters and Setters

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int[] getMarks() {
	        return marks;
	    }

	    public void setMarks(int[] marks) {
	        this.marks = marks;
	    }

	    public String getGrade() {
	        return grade;
	    }

	    public void setGrade(String grade) {
	        this.grade = grade;
	    }
	}

