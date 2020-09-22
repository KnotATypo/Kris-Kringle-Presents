package view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Engine;

@SuppressWarnings("serial")
public class Frame extends JFrame
{
	public Frame(Engine engine)
	{
		super("Kris Kringle Presents");
		setLayout(new GridLayout(2, 1));
		
		JPanel panel = new JPanel();

		engine.newFamily("Mackay");
		engine.newFamily("Dans");

		engine.addMember("Mackay", "Josh");
		engine.addMember("Mackay", "Sam");
		engine.addMember("Dans", "Toby");
		engine.addMember("Dans", "Geoff");

		JTextField field = new JTextField();
		JButton button = new JButton("New Family");
		Table table = new Table(engine);

		field.setColumns(20);
		table.updateData(engine.getFamilies());

		panel.add(button);
		panel.add(field);
		
		add(panel);
		add(table);

		setBounds(420, 220, 650, 460);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
