package student;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class RollCall implements ActionListener {
	Connection dbConn = null;
	int strNamesLength = 0;
	String[] strNames = null;
	

	public RollCall(Connection conn) { 
		// TODO Auto-generated constructor stub
		dbConn= conn;
	}
	public void setAttendance(String[] strNames, int[] iRollInfo){
		DBInfo dbInfo = new DBInfo();
		dbInfo.setAttendance(strNames, iRollInfo, dbConn);

		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		strNames = DBInfo.getNames(dbConn);
		strNamesLength = strNames.length;
		
		// Display names and chek box
		// Submit button
		
	    bSubmit.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		int[] iRollInfo = new int[strNamesLength];
	    		setAttendance(strNames, iRollInfo);
	    		frame.setVisible(false);
			}
		});



	}

}
