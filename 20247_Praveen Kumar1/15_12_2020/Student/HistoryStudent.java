package abstactDemo_Student;

public class HistoryStudent extends Student {
	int HstMarks;
	int civMarks;
	

	@Override
	void getPersentage() {
		int total=HstMarks+civMarks;
		System.out.println("Student TotalMarks : "+total);
		double percentage = (total / 2);
		System.out.println("Student percentage is : "+percentage);

	}

	@Override
	void totalNoStudents() {
		System.out.println("TotalNoofStudents is "+noOfStd);

	}

	public HistoryStudent() {

	}

	public HistoryStudent(String stdName,String stdClass,int hstMarks, int civMarks) {
		super(stdName,stdClass);
		HstMarks = hstMarks;
		this.civMarks = civMarks;
	}

	@Override
	public String toString() {
		return "HistoryStudent [StudentName= " + stdName + ", StudentClass= " + stdClass + "HstMarks=" + HstMarks + ", civMarks=" + civMarks +"]";
	}
	
	

}
