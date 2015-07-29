package student;
import java.io.*;
import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * main class
 * */

public class StudentManagement {
	
	public static void main(String[] args)throws IOException {
		
		String strClassName = "";
		String strClassType = "";
		String strTeacherName = "";
		
		//get the db connection 
		DBConnection dbConn = new DBConnection();
		Connection conn = dbConn.GetConnection();
		
		// Show the main App window
		StudentUIApp studentApp = new StudentUIApp();
		studentApp.displayApp(conn);
		
		// Check if the Teacher Name exists in the DB ClassTable
		DBInfo dbInfo = new DBInfo();
		String[] strClassInfo = null;
		strClassInfo = dbInfo.getClassInfo(conn);
		if (strClassInfo==null) {
			// ask the user Class Name, Class Type, Teacher Name in a sub window
			strClassInfo = studentApp.getClassInfoUI();
			dbInfo.setClassInfo(conn, strClassInfo);
		} 
		   		
		//close the connection
		try{
			conn.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}