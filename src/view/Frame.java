package view;

import java.awt.GridLayout;

import javax.swing.JFrame;
import model.Engine;

@SuppressWarnings("serial")
public class Frame extends JFrame
{
	public Frame(Engine engine)
	{
		super("Kris Kringle Presents");
		setLayout(new GridLayout(2, 1));
		
		Table table = new Table(engine);
		UpperPanel upperPanel = new UpperPanel(engine, table);

		add(upperPanel);
		add(table);

		setBounds(420, 220, 650, 460);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
