package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button1;
	JButton button2;
	ArrayList <String> names = new ArrayList <String>();
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
public static void main(String[] args) {
	GuestBook make = new GuestBook();
	make.makeGUI();
}


void makeGUI() {
	frame = new JFrame();
	panel = new JPanel();
	button1 = new JButton();
	button2 = new JButton();
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	frame.setVisible(true);
	button1.setText("Add Name");
	button2.setText("View Names");
	button1.addActionListener(this);
	button2.addActionListener(this);
	frame.pack();
}


@Override
public void actionPerformed(ActionEvent e) {
	String n = "";
	// TODO Auto-generated method stub
	if(e.getSource() == button1) {
		String name = JOptionPane.showInputDialog("What name would you like to add?");
		names.add(name);
	}
	
	if(e.getSource() == button2) {
		for (int i = 0; i < names.size(); i++) {
			if(names.size() == 1) {
				n = names.get(1);
				break;
			}
			else {
			n = n  +  names.get(i) + "\n";
			}
		}
		JOptionPane.showMessageDialog(null, n);
	}
	
}
}