package controller;

import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import model.Engine;
import view.Frame;
import view.components.ComboBox;

public class AddMemberListener extends AbstractFrameListener
{
	private JTextField field;
	private ComboBox familySelection;
	
	public AddMemberListener(Engine engine, Frame frame, JTextField field, ComboBox familySelection)
	{
		super(engine, frame);
		this.field = field;
		this.familySelection = familySelection;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		engine.addMember(familySelection.getSelectedItem(), field.getText());
		field.setText("");
		
		frame.updateData(true);
	}

}