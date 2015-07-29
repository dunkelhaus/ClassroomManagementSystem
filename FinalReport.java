package student;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FinalReport implements ActionListener {
	Connection dbConn = null;

	
	public FinalReport(Connection conn) {
		// TODO Auto-generated constructor stub
		dbConn = conn;

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		DBInfo dbInfo = new DBInfo();
		dbInfo.getDetails(dbConn);

	}

}
