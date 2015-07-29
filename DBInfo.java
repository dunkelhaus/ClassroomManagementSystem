package student;
import java.sql.*;

import javax.sql.*;

/**
 * Retrieves the data from the Database
 */
public class DBInfo {

	private static final int TodatDays = 0;
	// returns all student names
	public static String[] getNames(Connection conn) {
		   Statement stStudentName = null;
		   String strStudentName[] = null;
		   String strSql;
		  
		   try {
		      strSql = "SELECT StudentName FROM StudentTable";
		      stStudentName = conn.createStatement();
		      ResultSet rs = stStudentName.executeQuery(strSql);
		      int i = 0;
		      while (rs.next()) {
			      strStudentName[i] = rs.getString("StudentName");
			      i++;
		      }
		      rs.close();
		      stStudentName.close();
		   } catch(SQLException e) {
			  e.printStackTrace();
		   } catch(Exception e) {
			   e.printStackTrace();		
		   }
		   return strStudentName;
	}
	
	public String[] getClassInfo(Connection conn){
		String strClassInfo[] = null;
		Statement stTeacherName = null;
		String strSql;
		  
		try {
			strSql = "SELECT * FROM ClassTable";
			stTeacherName = conn.createStatement();
			ResultSet rs = stTeacherName.executeQuery(strSql);
			while (rs.next()) {
				strClassInfo[0] = rs.getString("TeacherName");
				strClassInfo[0] = rs.getString("ClassName");
				strClassInfo[0] = rs.getString("ClassType");
			}
			rs.close();
			stTeacherName.close();
		  } catch(SQLException e) {
			  e.printStackTrace();
		  } catch(Exception e) {
			  e.printStackTrace();		
		  }
		return strClassInfo;
	}
	public void setClassInfo(Connection conn, String[] strClassInfo){
		
	}
	public void setName(String strStudentName, int iGrade) {
	
		
	}	
	public void removeName(String strStudentName) {
		
		
	}
	
	
	
	public static int getTotalPoints(String strStudentName) {
		return 0;
		// TODO Auto-generated method stub
		// Total of the AssignTotal for student name
		
	}

	public static int getScore(String strStudentName) {
		return 0;
		// TODO Auto-generated method stub
		// Total of all scores for a student
		
	}

	public static int[] getAttendanceStatus(String strStudentName) {
		// TODO Auto-generated method stub
		
		int daysPresnet = 0;
		int iStatus[]=null;
		iStatus[0] = daysPresnet;
		iStatus[1] = TodatDays;
		return iStatus;
	}

	public static void setAttendance(String[] strRollInfo, int[] iRollInfo, Connection dbConn) {
		// TODO Auto-generated method stub
		
		
	}

	public static String[] getDetails(String strSTudentName) {
		return null;
		// Grade
		// all Assignement Name
		// all Score
		// Total score
		//number of days present
		//Total days
		// strClassInfo
		// TODO Auto-generated method stub
		
	}

	public static int[] getStatus(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void setStudentInfo(String[] strStudentInfo, Connection dbConn) {
		
		// TODO Auto-generated method stub
		
	}

	public static void deleteStudentInfo(String[] strInfoStudent, Connection dbConn) {
		// TODO Auto-generated method stub
		
	}

	public static void setAssignmentInfo(String[] strAssignmentInfo, Connection dbConn) {
		// TODO Auto-generated method stub
		
		
	}

	public static void RemoveAssignmentName(String strAssignmentName, Connection dbConn) {
		// TODO Auto-generated method stub
		
	}

	public String getAssignmentNames() {
		
		// TODO Auto-generated method stub
		return null;
	}

	public void addScores(String strAssignmentName, String[] strStudentNames,
			int[] intScores, Connection dbConn) {
		// TODO Auto-generated method stub
		
	}

	public void getStudentGrade(String strStudentName, Connection dbConn) {
		// TODO Auto-generated method stub
		
	}
}