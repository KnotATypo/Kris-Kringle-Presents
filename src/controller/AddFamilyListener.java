package controller;

import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import view.Frame;

public class AddFamilyListener extends AbstractListener
{
	private JTextField field;
	
	public AddFamilyListener(Frame frame, JTextField field)
	{
		super(frame);
		this.field = field;
	}

	@Override public void actionPerformed(ActionEvent e)
	{
		engine.newFamily(field.getText());
		field.setText("");
		
		frame.updateData(false);
	}

}
