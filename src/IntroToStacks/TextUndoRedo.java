package IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener {
	JFrame frame;
	JPanel panel;
	JLabel label;
	Stack<Character> Remove = new Stack<Character>();
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 *
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	public static void main(String[] args) {
		TextUndoRedo run = new TextUndoRedo();
		run.makeStuff();
	}
	
	
	
	void makeStuff () {
		frame = new JFrame();
		panel = new JPanel();
		label = new JLabel();
		frame.add(panel);
		panel.add(label);
		frame.setVisible(true);
		frame.addKeyListener(this);
		frame.pack();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		char user = e.getKeyChar();
		label.setText( label.getText() + user + "" );
		frame.pack();
	
		
		if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			String User1 = label.getText();
			char delete = User1.charAt(User1.length() -1);
			Remove.push(delete);
			User1 = User1.substring(0, User1.length() -2);
			label.setText(User1);
		}
		
		if(e.getKeyCode() == KeyEvent.VK_TAB) {
			 char undo = Remove.pop();
			 String old = label.getText();
			 label.setText(old + undo);
			 frame.pack();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
}
