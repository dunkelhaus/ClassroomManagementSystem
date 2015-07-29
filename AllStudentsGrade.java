package student;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AllStudentsGrade implements ActionListener {
	Connection dbConn = null;

	
	public AllStudentsGrade(Connection conn) {
		// TODO Auto-generated constructor stub
		dbConn = conn;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		
		DBInfo dbInfo = new DBInfo();
		
		String[] strNames = dbInfo.getNames(dbConn);
		
		for loop {
			dbInfo.getStudentGrade(strStudentName, dbConn);
		}
	

		


	}

}
