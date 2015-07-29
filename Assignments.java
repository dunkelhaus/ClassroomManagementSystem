package student;
import java.io.*;
import java.sql.Connection;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
public class Assignments
{
	static String assignmentName = "";
	static String openedAssignment = "";
	static int newScore = 0;
	static int totalPoints = 0;
	
	public static void getTotalPoints()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter total points of assignment");
		int totalPoints=Integer.parseInt(br.readLine());
		//store to database
	}
	public static String openAssignment()
	{
		JLabel label = new JLabel("Enter Name Of The Assignment You Want To Open");
		final JTextField field = new JTextField();
		field.setVisible(true);
		label.setLabelFor(field);
		field.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	    		openedAssignment = field.getText();
			}
		});
		return openedAssignment;
		}
	public static String nameToOpenAssignment()
	{
		JLabel label = new JLabel("Enter Name Of The Studen Whose Assignment You Want To Open");
		final JTextField field = new JTextField();
		field.setVisible(true);
		label.setLabelFor(field);
		field.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	    		openedAssignment = field.getText();
			}
		});
		return openedAssignment;
	}
	public static int[] changeScoreData() {
	//use method in DBinfo to get data from database, store it in array
	//from string array, take elements
	//1st is name, 2nd is assignment name, 3 is score, 4 is total points
	String[] data= null;
	int score = Integer.parseInt(data[2]);
	int totalPoints = Integer.parseInt(data[3]);
	final JTextField scoreField = new JTextField(data[3]);
	JLabel scoreLabel = new JLabel(data[0]+"'s Score is");
	scoreLabel.setLabelFor(scoreField);
	scoreLabel.setVisible(true);
	scoreField.setVisible(true);
	final JTextField totalScoreField = new JTextField(data[3]);
	JLabel totalScoreLabel = new JLabel(data[0]+"'s Score is");
	totalScoreLabel.setLabelFor(scoreField);
	totalScoreLabel.setVisible(true);
	totalScoreField.setVisible(true);
	scoreField.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
    		newScore = Integer.parseInt(scoreField.getText());
		}
	});
	totalScoreField.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
    //		totalPoints = Integer.parseInt(totalScoreField.getText());
		}
	});
	return null;
}
	
	public static void getScore(Connection conn)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//get names from database
		String names[]=DBInfo.getNames(conn);
		int scores[] = null;
		for(int i=0;i<names.length;i++)
		{
			System.out.println("Enter score for "+names[i]);
			scores[i]=Integer.parseInt(br.readLine());
		}
		//store scores to database
	}
}
