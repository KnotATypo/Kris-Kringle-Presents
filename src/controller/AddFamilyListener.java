package controller;

import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import model.Engine;
import view.Frame;

public class AddFamilyListener extends AbstractListener
{
	private JTextField field;
	
	public AddFamilyListener(Engine engine, Frame frame, JTextField field)
	{
		super(engine, frame);
		this.field = field;
	}

	@Override public void actionPerformed(ActionEvent e)
	{
		engine.newFamily(field.getText());
		field.setText("");
		
		frame.updateData(false);
	}

}
