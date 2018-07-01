package IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack<Double> stack = new Stack<Double>();
		
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		for (int i = 0; i < 100; i++) {
		
			Random r = new Random();
			double num = r.nextDouble() * 100;
			stack.push(num);
		
		}
		
		
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		//
		
		String user1 = JOptionPane.showInputDialog("Enter one number between 0 and 100 inclusive");
		String user2 = JOptionPane.showInputDialog("Enter another number between 0 and 100 inclusive");
		int user01 = Integer.parseInt(user1);
		int user02 = Integer.parseInt(user2);
		int temp = user01;
		if(user02 > user01) {
			user01 = user02;
			user02 = temp;
		}
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		int size = stack.size();
		System.out.println("Popping elements off the stack..." + "\nElements between " + user02 + " and " + user01 + ":");
		for (int i = 0; i < size; i++) {
			double d = stack.pop();
			if(d < user01 && d > user02  ) {
				System.out.println(d);
			}
		}
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
