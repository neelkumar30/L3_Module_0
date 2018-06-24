package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	HashMap<Integer, String> ID = new HashMap<Integer, String>();

	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values. Create a
	 * GUI with three buttons. Button 1: Add Entry When this button is clicked, use
	 * an input dialog to ask the user to enter an ID number. After an ID is
	 * entered, use another input dialog to ask the user to enter a name. Add this
	 * information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog to
	 * ask the user to enter an ID number. If that ID exists, display that name to
	 * the user. Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list in a
	 * message dialog in the following format: 
	 * ID: 123 Name: Harry Howard 
	 * ID: 245 Name: Polly Powers 
	 * ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4: Remove
	 * Entry When this button is clicked, prompt the user to enter an ID using an
	 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
	 * the user that the ID is not in the list.
	 *
	 */
	public static void main(String[] args) {
		LogSearch run = new LogSearch();
		run.makeGUI();
	}

	void makeGUI() {
		frame = new JFrame();
		panel = new JPanel();
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		button4 = new JButton();
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		frame.setVisible(true);
		button1.setText("Add Name");
		button2.setText("Search by ID");
		button3.setText("View List");
		button4.setText("Remove Entry");
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String n = "";
		String k;
		int count = 0;
		// TODO Auto-generated method stub
		if (e.getSource() == button1) {
			String user = JOptionPane.showInputDialog("What ID would you like to add?");
			int userID = Integer.parseInt(user);
			String userName = JOptionPane.showInputDialog("What name would you like to add?");
			ID.put(userID, userName);
		}

		if (e.getSource() == button2) {
			String search = JOptionPane.showInputDialog("What ID would you like to search?");
			int s = Integer.parseInt(search);
			if(ID.containsKey(s)) {
				JOptionPane.showMessageDialog(null, "The name with the ID of " + s + " is " + ID.get(s));
			}
			
			else {
				JOptionPane.showMessageDialog(null, "There is no name with that ID");
			}
		}
		
		if(e.getSource() == button3) {
			for (Integer key : ID.keySet()) {
				n = n + "ID: " + key + " Name: " + ID.get(key) + "\n";
			}
			JOptionPane.showMessageDialog(null, n);
		}
		
		if(e.getSource() == button4) {
			String user = JOptionPane.showInputDialog("What ID would you like to remove?");
			int userID = Integer.parseInt(user);
			if(ID.containsKey(userID)) {
				ID.remove(userID);
			}
			
			else {
				JOptionPane.showMessageDialog(null, "No such ID exists");
			}
		}
	}
}
