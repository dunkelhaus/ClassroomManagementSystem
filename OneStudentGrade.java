package student;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class OneStudentGrade implements ActionListener {

	Connection dbConn = null;


	public OneStudentGrade(Connection conn) {
		// TODO Auto-generated constructor stub
		dbConn = conn;

	}
	public String getStudentGrade(String strStudentName){
		DBInfo dbInfo = new DBInfo();
		dbInfo.getStudentGrade(strStudentName, dbConn);
	
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	
		
		Submit.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String strStudentName = "";
	    		strStudentName[0] = fields[0].getText();
	    		getStudentGrade(strStudentName);
	    		frame.setVisible(false);
			}
		});


	}

}
