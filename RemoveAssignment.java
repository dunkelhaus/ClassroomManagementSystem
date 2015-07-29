package student;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class RemoveAssignment implements ActionListener {
	Connection dbConn = null;
	
	public RemoveAssignment(Connection conn) {
		// TODO Auto-generated constructor stub
		dbConn = conn;

	}

	public void RemoveAssignmentName(String strAssignmentName){
		
		DBInfo dbInfo = new DBInfo();
		dbInfo.RemoveAssignmentName(strAssignmentName, dbConn);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		
		
		Submit.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String strAssignmentName = "";
	    		strAssignmentName = fields[0].getText();
	    		RemoveAssignmentName(strAssignmentName);
	    		frame.setVisible(false);
			}
		});


	}

}
