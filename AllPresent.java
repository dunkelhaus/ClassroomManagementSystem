package student;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AllPresent implements ActionListener {
	Connection dbConn = null;


	
	public AllPresent(Connection conn) {
		// TODO Auto-generated constructor stub
		dbConn = conn;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		DBInfo dbInfo = new DBInfo();
		dbInfo.getNames(dbConn);
		dbInfo.setAttendance(strRollInfo, iRollInfo,dbConn);
	}

}
