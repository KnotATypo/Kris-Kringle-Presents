package controller;

import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import model.Engine;
import view.Table;

public class AddFamilyListener extends AbstractListener
{
	private JTextField field;
	private Table table;
	
	public AddFamilyListener(Engine engine, Table table, JTextField field)
	{
		super(engine);
		this.field = field;
		this.table = table;
	}

	@Override public void actionPerformed(ActionEvent e)
	{
		engine.newFamily(field.getText());
		field.setText("");
		
		table.updateData(engine.getFamilies());
	}

}
