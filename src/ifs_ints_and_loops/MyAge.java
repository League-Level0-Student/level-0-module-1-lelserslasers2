package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class MyAge {

	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("Enter your age:");
		int ageTwo = Integer.parseInt(age);
		for (int i = 1; i < ageTwo + 1; i++) {
			System.out.println(i);
		}

	}

}
