package _02_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
	String s = JOptionPane.showInputDialog("what is your birthday? (mm/dd make sure to include the /)");
	if (s.equals("08/28"))
		{
			JOptionPane.showMessageDialog(null, "Happy birthday!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Have a very merry unbirthday!");
		}
	}
}
