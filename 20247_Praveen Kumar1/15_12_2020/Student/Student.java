package abstactDemo_Student;

public abstract class Student {
	static String stdName;
	static String stdClass;
	protected static int noOfStd;

	public Student() {

	}

	public Student(String stdName, String stdClass) {
		this.stdName = stdName;
		this.stdClass = stdClass;
	}

	abstract void getPersentage();

	abstract void totalNoStudents();

}
