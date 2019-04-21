package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class Remarkable {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Who are you?");
		if (name.equals("john")) {
			JOptionPane.showMessageDialog(null, "You are good at jumping");
		} else if (name.equals("bob")) {
			JOptionPane.showMessageDialog(null, "You are good at sitting");
		} else if (name.equals("joe")) {
			JOptionPane.showMessageDialog(null, "You are good at not tripping");
		} else {
			JOptionPane.showMessageDialog(null, "I don't know you");
		}
	}

}
