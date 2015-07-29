package student;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AddScores implements ActionListener {
	
	Connection dbConn = null;
	
	//write a constructor to set the conn
	
	public AddScores(Connection conn) {
		dbConn = conn;
		
		// TODO Auto-generated constructor stub
	}

	public void addScores(String strAssignmentName, String[] strStudentNames, int[] intScores){
		DBInfo dbInfo = new DBInfo();
		dbInfo.addScores(strAssignmentName, strStudentNames, intScores, dbConn);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		

		String strAssignmentNames = dbInfo.getAssignmentNames();
		
		String strStudentNames = dbInfo.getNames(conn);
		
		
		
		
		

		Submit.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String strAssignmentName = "";
	    		String[] strStudentNames = new String[strStudentNames.length];
	    		int[] intScores = new int[strStudentNames.length];
	    		addScores(strAssignmentName, strStudentNames, intScores);
	    		frame.setVisible(false);
			}
		});


	}

}
