package view;

import java.awt.GridLayout;

import javax.swing.JFrame;
import model.Engine;
import view.components.Table;
import view.panels.UpperPanel;

@SuppressWarnings("serial")
public class Frame extends JFrame
{
	private Engine engine;
	private Table table;
	private UpperPanel upperPanel;
	
	public Frame(Engine engine)
	{
		super("Kris Kringle Presents");
		setLayout(new GridLayout(2, 1));
		
		this.engine = engine;
		
		table = new Table(engine);
		upperPanel = new UpperPanel(engine, table, this);

		add(upperPanel);
		add(table);

		setBounds(420, 220, 650, 460);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void updateData(boolean onlyTable)
	{
		table.updateData(engine.getFamilies());
		
		if(!onlyTable)
			upperPanel.updateData();
	}
}
