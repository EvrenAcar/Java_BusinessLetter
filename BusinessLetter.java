// Chapter 7 example (Pg 345)

import javax.swing.*;
// import javax.swing.JOptionPane;

public class BusinessLetter {
	public static void main(String[] args) {

// Variables and constants
		String fullName;
		String firstName = "";
		String lastName = "";
		int x= 0;

// Input phase
		fullName = JOptionPane.showInputDialog(null, "Please enter the customers full name: ");

// Processing phase
		while(x < fullName.length()) {
			if(fullName.charAt(x) == ' ') {
				firstName = fullName.substring(0,x);
				lastName = fullName.substring(x + 1, fullName.length());
				x = fullName.length();
			}

			++x; // adjust the loop variable
		}
// Output phase
		JOptionPane.showMessageDialog(null, "Dear " + firstName + ", \nI am so glad we are on a first name basis" + "\nbecause I would like the opportunity to" + "\ntalk to you about an affordable insurance" + "\nproctection plan for the entire " + lastName + "\nfamily. Call A-One Family Inscurance today.");
	}
}