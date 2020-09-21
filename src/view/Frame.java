package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;

import model.Engine;

@SuppressWarnings("serial")
public class Frame extends JFrame
{
	public Frame(Engine engine)
	{
		super("Kris Kringle Presents");
		setLayout(new FlowLayout());
		
		engine.newFamily("Mackay");
		engine.newFamily("Dans");
	
		engine.addMember("Mackay", "Josh");
		engine.addMember("Mackay", "Sam");
		engine.addMember("Dans", "Toby");
		engine.addMember("Dans", "Geoff");
		
		JTextField field = new JTextField();
		JButton button = new JButton("Test");
		Table table = new Table(engine);
		
		field.setColumns(20);
		table.updateData(engine.getFamilies());
		
		add(button);
		add(field);
		add(table);
		
		setBounds(420, 220, 650, 460);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
