package student;
import java.io.*;
public class Enrol
{
	public static void main(String[]args)throws IOException
	{
		int numStudents=0;
		numStudents=getNumberOfStudents();
		getNameAndGrade(numStudents);
	}
	public static int getNumberOfStudents()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of students");
		int numStudents=Integer.parseInt(br.readLine());
		return numStudents;
	}
	public static void getNameAndGrade(int numStudents)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] names=new String[numStudents+1];
		int grades[]=new int[numStudents+1];
		for(int i=1;i<=numStudents;i++)
		{
			System.out.println("Enter full name of "+i+"th student");
			names[i]=br.readLine();
			//send to database
			System.out.println("Enter "+i+"th student's grade");
			grades[i]=Integer.parseInt(br.readLine());
			//send to database
		}
	}
}
