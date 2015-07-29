package student;
import java.io.*;
import java.sql.Connection;
public class ViewCurrentGrade
{
	public static void getOneStudentGrade()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name of student");
		String name=br.readLine();
		int totalPoints=0;//DBInfo.getTotalPoints();
		int score=DBInfo.getScore(name);
		String classType="";//DBInfo.getClassType();
		double percent=GradeCalc.calcPercent(totalPoints, score);
		String grade=GradeCalc.calcGrade(percent);
		double gpa=GradeCalc.calcGpa(grade, classType);
		System.out.println("Current Percent = "+percent);
		System.out.println("Current Grade = "+grade);
		System.out.println("Current Grade Point Average = "+gpa);
	}
	public static void getAllStudentsGrade()
	{
		DBConnection dbConn = new DBConnection();
		Connection conn = dbConn.GetConnection();

		String[] names=DBInfo.getNames(conn);
		int numStudents=names.length;
		for(int i=0;i<numStudents;i++)
		{
			String name=names[i];
			int totalPoints=0;//DBInfo.getTotalPoints();
			int score=DBInfo.getScore(name);
			String classType="";//DBInfo.getClassType();
			double percent=GradeCalc.calcPercent(totalPoints, score);
			String grade=GradeCalc.calcGrade(percent);
			double gpa=GradeCalc.calcGpa(grade, classType);
			System.out.println("Current Percent = "+percent);
			System.out.println("Current Grade = "+grade);
			System.out.println("Current Grade Point Average = "+gpa);
		}
	}
}
