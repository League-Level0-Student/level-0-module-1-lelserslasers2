package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class SEcretMessage {

	public static void main(String[] args) {
		String password = JOptionPane.showInputDialog("CReate a password");
		String message = JOptionPane.showInputDialog("Enter secrect message:");
		String inpass = JOptionPane.showInputDialog("Guess yhe password:");
		if (inpass.equals(password)) {
			JOptionPane.showMessageDialog(null, "Message: " + message);
		} else {
			JOptionPane.showMessageDialog(null, "INTRUDER!!!");
		}
	}

}
