package abstactDemo_Student;

import java.util.Scanner;

public class StudentChecker {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Student");
		Student.noOfStd = sc.nextInt();
		for (int i = 0; i < Student.noOfStd; i++) {

			System.out.println(""+"\n"+"please Enter Student  " + (i + 1) + "  Name and Class");
			String stdName = sc.next();
			String stdClass = sc.next();
			System.out.println("Please Select  ");
			System.out.println("1.ScienceStudent");
			System.out.println("2.HistoryStudent");
			int option = sc.nextInt();
			switch (option) {

			case 1:

				System.out.println("please Enter " + (i + 1) + " Student  physicsMarks  ChemestryMarks MathsMrks");
				ScinceStudent science = new ScinceStudent(stdName, stdClass, sc.nextInt(), sc.nextInt(), sc.nextInt());
				science.getPersentage();

				System.out.println(science);

				break;

			case 2:
				System.out.println("please Enter " + (i + 1) + " HistoryMarks  And  CivicsMarks");
				HistoryStudent history = new HistoryStudent(stdName, stdClass, sc.nextInt(), sc.nextInt());
				;
				history.getPersentage();

			}

		}
		
	}

}
