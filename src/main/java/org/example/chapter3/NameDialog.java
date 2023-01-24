//fig. 3.13: NameDialog.java
//Obtaining user input from a dialog

import javax.swing.JOptionPane;

public class NameDialog
{
	public static void main(String[] args)
	{
		String name = JOptionPane.showInputDialog("What is your name?");//prompt user to enter name
		
		String message = String.format("Welcome, %s, to Java Programming!", name);//create the message
		
		//display the message to welcome the user by name
		JOptionPane.showMessageDialog(null, message);
		
	}//end main
}//end class NameDialog
		
