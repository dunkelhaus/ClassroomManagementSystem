package student;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;
/**
 * 
 * Main UI screen of the App
 *
 */
import java.io.*;
public class StudentUIApp
{
	JFrame appFrame = new JFrame("Student Class Manager");
	//	JButton buttonRahul, buttonRoshu, button1,button2 ;
	//	JTextField textField;
	JMenuBar appMenuBar;
	String[] strClassInfo = null;
	JTextField[] fields = null;
	//Launch the main UI		
	public void displayApp(Connection conn)throws IOException 
	{
		//set the application icon
		BufferedImage image = null;
		try
    	{
        	image = ImageIO.read(appFrame.getClass().getResource("/CMS-logo.gif"));
	    }catch (IOException e)
	    {
	    	e.printStackTrace();
	    }
	    appFrame.setIconImage(image);
	    appFrame.setSize(1000, 800);
	    appFrame.setVisible(true);
        
		// create the menu bar and add the menus	
        JMenuBar appMenuBar = new JMenuBar();
        appFrame.setJMenuBar(appMenuBar);
        JMenu mEnroll = new JMenu("Enrol");
        JMenu mAttendance = new JMenu("Attendance");
        JMenu mAssignment = new JMenu("Assignment");
        JMenu mReports = new JMenu("Reports");
        JMenu mExit = new JMenu("Exit Application");
        appMenuBar.add(mEnroll);
        appMenuBar.add(mAttendance);	        
        appMenuBar.add(mAssignment);	        
        appMenuBar.add(mReports);
        appMenuBar.add(mExit);
        
        //Create the menu items for each menu
        JMenuItem smAddStudent = new JMenuItem("Add Student");
        JMenuItem smRemoveStudent = new JMenuItem("Remove Student");
        JMenuItem smRollCallAttendance = new JMenuItem("Roll Call");
        JMenuItem smAllPresent = new JMenuItem("All Present");
        JMenuItem smNew = new JMenuItem("Add Assignment");
        JMenuItem smOpen = new JMenuItem("Remove Assignment");
        JMenuItem smAddScore = new JMenuItem("Add Score");
        JMenuItem smCurrentGrade = new JMenu("Current Grade");
        JMenuItem smFinalReport = new JMenuItem("Final Report Student");
        // Add submenu for Current grade item
        JMenuItem smmAStudent = new JMenuItem("One Student");
        JMenuItem smmAllSTudent = new JMenuItem("All Students");
        
        smAddStudent.addActionListener(new AddStudent(conn));
        smRemoveStudent.addActionListener(new RemoveStudent(conn));
        
        smRollCallAttendance.addActionListener(new RollCall(conn));
        smAllPresent.addActionListener(new AllPresent(conn));
        smNew.addActionListener(new AddAssignment(conn));
        smOpen.addActionListener(new RemoveAssignment(conn));
        smAddScore.addActionListener(new AddScores(conn));
        
        smmAStudent.addActionListener(new OneStudentGrade(conn));
        smmAllSTudent.addActionListener(new AllStudentsGrade(conn));
        smFinalReport.addActionListener(new FinalReport(conn));
        
        // handling the exit handler
        mExit.addActionListener(new ActionListener()
        {
	    	public void actionPerformed(ActionEvent e)
	    	{
	    		// Ask user to save all data
	    		// Exit Application
	    	}
	    });
        //Add menu item to menus
        mEnroll.add(smAddStudent);
        mEnroll.add(smRemoveStudent);
        mAttendance.add(smRollCallAttendance);	        
        mAttendance.add(smAllPresent);
        mAssignment.add(smNew);
        mAssignment.add(smOpen);
        mAssignment.add(smAddScore);
        mReports.add(smCurrentGrade);
        mReports.add(smFinalReport);
        // add submenu items
        smCurrentGrade.add(smmAStudent);
        smCurrentGrade.add(smmAllSTudent);
       
		appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//appFrame.pack();
	}
	//Get the class info from the user as it does not exist in DB
	public String[] getClassInfoUI()
	{
		JPanel appPanel = new JPanel();
		JButton bSubmit = new JButton("Submit");
		String[] labels = { "Teacher Name", "Class Name", "Class Type"};
	    int[] widths = { 15, 15, 15 };
	    String[] descs = { "Teacher Name", "Class Name", "Class Type" };
	    JPanel labelPanel = new JPanel(new GridLayout(labels.length, 1));
	    JPanel fieldPanel = new JPanel(new GridLayout(labels.length, 1));
	    appPanel.add(labelPanel, BorderLayout.WEST);
	    appPanel.add(fieldPanel, BorderLayout.CENTER);
	    fields = new JTextField[labels.length];
	    for (int i = 0; i < labels.length; i += 1)
	    {
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
	   bSubmit.addActionListener(new ActionListener()
		   {
		   public void actionPerformed(ActionEvent e)
		   {
	   			strClassInfo[0] = fields[0].getText();
	   			strClassInfo[1] = fields[1].getText();
	   			strClassInfo[2] = fields[2].getText();
	   			// handle Submit action;
		   }
	   });
	   appPanel.add(bSubmit);
	   appFrame.add(appPanel);
	   return strClassInfo;
	}
}
