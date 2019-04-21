package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class Riddles {

	public static void main(String[] args) {
		int score = 0;
		String ans1 = JOptionPane
				.showInputDialog("I have a toungue but cannot talk. I have no legs but sometimes walk. What am I?");
		if (ans1.equals("a shoe")) {
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "WRONG! Correct answer: a shoe");
		}
		JOptionPane.showMessageDialog(null, "score: " + score);
		String ans2 = JOptionPane.showInputDialog(
				"Your mother and father have a child. It is not your brother and it is not your sister. Who is it?");
		if (ans2.equals("It's you")) {
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "WRONG! Correct answer: It's you");
		}
		JOptionPane.showMessageDialog(null, "score: " + score);
	}

}
