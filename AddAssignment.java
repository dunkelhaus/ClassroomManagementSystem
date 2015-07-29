package student;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddAssignment implements ActionListener {
	
	Connection dbConn = null;

	public AddAssignment(Connection conn) {
		dbConn = conn;
	}
	public void setAssignmentInfo(String[] strAssignmentInfo){
		DBInfo dbInfo = new DBInfo();
		dbInfo.setAssignmentInfo(strAssignmentInfo, dbConn);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		JLabel assignmentLabel = new JLabel("Enter Name Of Assignment");
		final JTextField assignmentField = new JTextField();
		assignmentField.setVisible(true);
		assignmentLabel.setLabelFor(assignmentField);
//		assignmentField.addActionListener(new ActionListener() {
 //  		assignmentName = assignmentField.getText();
		
	    bSubmit.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String[] strAssignmentInfo = new String[2];
	    		strAssignmentInfo[0] = fields[0].getText();
	    		strAssignmentInfo[1] = fields[1].getText();
	    		setAssignmentInfo(strAssignmentInfo);
	    		frame.setVisible(false);
			}
		});

		
		
		
		}

}
