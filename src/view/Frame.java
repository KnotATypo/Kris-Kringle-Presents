package view;

import javax.swing.JFrame;

import model.Engine;

@SuppressWarnings("serial")
public class Frame extends JFrame
{
	public Frame(Engine engine)
	{
		super("Kris Kringle Presents");
		
		setBounds(420, 220, 650, 460);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
