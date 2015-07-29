package student;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class AddStudent implements ActionListener {
	
		JFrame frame = new JFrame();
		JTextField[] fields = null;
		Connection dbConn = null;

		public AddStudent(Connection conn) {
			dbConn = conn;
			
			// TODO Auto-generated constructor stub
		}

		public void setStudentInfo(String[] strInfoStudent){
			DBInfo dbInfo = new DBInfo();
			dbInfo.setStudentInfo(strInfoStudent, dbConn);
	}

		public void actionPerformed (ActionEvent e) {   
			
			frame.setSize(1000,  500);
			
			JButton bSubmit = new JButton("Submit");
			JPanel panel = new JPanel();
			panel.setVisible(true);
			
			String[] labels = { "Student Name", "Student Grade"};
		    int[] widths = { 50, 10 };
		    String[] descs = { "Enter Student Name", "Enter Student Grade" };

			JPanel labelPanel = new JPanel(new GridLayout(labels.length, 1));
		    JPanel fieldPanel = new JPanel(new GridLayout(labels.length, 1));
		    panel.add(labelPanel, BorderLayout.WEST);
		    panel.add(fieldPanel, BorderLayout.CENTER);
		    fields = new JTextField[labels.length];

		    for (int i = 0; i < labels.length; i += 1) {
		      fields[i] = new JTextField();
		      if (i < descs.length)
		        fields[i].setToolTipText(descs[i]);
		      if (i < widths.length)
		        fields[i].setColumns(widths[i]);

		      JLabel lab = new JLabel(labels[i], JLabel.RIGHT);
		      lab.setLabelFor(fields[i]);

		      labelPanel.add(lab);
		      JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
		      p.add(fields[i]);
		      fieldPanel.add(p);
		    }
		    bSubmit.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent e) {
		    		String[] strStudentInfo = new String[2];
		    		strStudentInfo[0] = fields[0].getText();
		    		strStudentInfo[1] = fields[1].getText();
		    		setStudentInfo(strStudentInfo);
		    		frame.setVisible(false);
				}
			});
	
			panel.add(bSubmit);
			frame.add(panel);
			frame.setVisible(true);

	 }
}
