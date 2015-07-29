package student;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class AttendanceUI 
{
	ButtonGroup attendance = null;
	JRadioButton present = null;
	JRadioButton absent = null;
	 public void actionPerformed (ActionEvent e) 
	 {     
		JFrame frame2 = new JFrame("RadioButtons");
		frame2.setVisible(true);
		frame2.setSize(200,200);
		  
		present = new JRadioButton("Present"  , true);
		absent    = new JRadioButton("Absent"   , false);
		attendance = new ButtonGroup();
		attendance.add(present);
		attendance.add(absent);
		JPanel radioPanel = new JPanel();
		radioPanel.setLayout(new GridLayout(4, 1));
		radioPanel.add(present);
		radioPanel.add(absent);
		radioPanel.setBorder(BorderFactory.createTitledBorder(
		           BorderFactory.createEtchedBorder(), "My Favourite"));
		
		ActionListener action = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JRadioButton button = (JRadioButton) e.getSource();
                int x=1;
                System.out.println(x);
                
            }
        };
        present.addActionListener(action);
        
        ActionListener action1 = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JRadioButton button = (JRadioButton) e.getSource();
                int x=0;
                System.out.println(x);
                
            }
        };
        absent.addActionListener(action);
	}
}
