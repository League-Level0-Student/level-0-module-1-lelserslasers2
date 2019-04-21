package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class Unbirthday {

	public static void main(String[] args) {
		String bday = JOptionPane.showInputDialog("When is your birthday? (mm/dd)");
		String todayDate = "04/21";
		if (bday.equals(todayDate)) {
			JOptionPane.showMessageDialog(null, "Happy birthday!");
		} else {
			JOptionPane.showMessageDialog(null, "Happy UNbirthday!");
		}
	}

}
