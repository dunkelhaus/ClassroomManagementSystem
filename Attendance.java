package student;
import java.io.*;
import java.sql.Connection;
public class Attendance
{

	public static void getStatus(Connection conn)
	{
		
		int[] status=null;
		String[] names=DBInfo.getNames(conn);
		for(int i=0;i<names.length;i++)
		{
			System.out.println("Is "+names[i]+" Present?");
			//take input as radio button, save as 1 for present, 0 for Absent
		}
		//send status to database for date mm/dd/yyyy
		//DBInfo.setStatus(status);
	}
	public static int[] calcStats(Connection conn)
	{
		String[] names=DBInfo.getNames(conn);
		int[] status;
		int sum=0;
		int[] stats=new int[names.length];
		for(int i=0;i<names.length;i++)
		{
			status=DBInfo.getStatus(names[i]);
			for(int j=0;j<status.length;j++)
			{
				sum=sum+status[j];
			}
			stats[i]=sum;
		}
		return stats;
	}
	public static int calcNumOfEntries(Connection conn)
	{
		int numOfEntries;
		String[] names=DBInfo.getNames(conn);
		int[] status;
		status=DBInfo.getStatus(names[0]);
		numOfEntries=status.length;
		return numOfEntries;
	}
}
