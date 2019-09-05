package _07_riddler;

import java.awt.Component;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String answer1 = JOptionPane.showInputDialog("When I'm young, I am tall. "
				+ "When I'm old I am short. What am I?");
		if(answer1.equalsIgnoreCase("A candle") || answer1.equals("candle"))
		{
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Wrong! The answer was a candle.");
		}
		String answer2 = JOptionPane.showInputDialog("What has hands but can not clap?");
		if(answer2.equalsIgnoreCase("a clock") || answer2.equals("clock"))
		{
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Wrong! The answer was a clock.");
		}
		String answer3 = JOptionPane.showInputDialog("You can drop me from the "
				+ "tallest building and I'll be fine,"
				+ " but if you drop me in water I die. What am I?");
		if(answer3.equalsIgnoreCase("paper") || answer3.equals("a piece of paper"))
		{
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Wrong! The answer was paper.");
		}

		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
		
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your score is " + score);
	}
}

