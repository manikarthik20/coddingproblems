package abstactDemo_Student;

public class ScinceStudent extends Student {
	int phyMarks;
	int cheMarks;
	int matMarks;

	@Override
	void totalNoStudents() {
		System.out.println("TotalNoofStudents is "+noOfStd);

	}

	public ScinceStudent(String stdName,String stdClass,int phyMarks, int cheMarks, int matMarks) {
		super(stdName,stdClass);

		this.phyMarks = phyMarks;
		this.cheMarks = cheMarks;
		this.matMarks = matMarks;

	}

	@Override
	void getPersentage() {
		int total = phyMarks + cheMarks + matMarks;
		System.out.println("student Total Marks : "+total);
		double percentage = (total / 3);
		System.out.println("Student percentage is :" + percentage);

	}

	public ScinceStudent() {

	}

	@Override
	public String toString() {
		return "ScinceStudent [StudentName= " + stdName + ", StudentClass= " + stdClass + " phyMarks=" + phyMarks
				+ ",  cheMarks=" + cheMarks + ",  matMarks=" + matMarks + "]";
	}

}
