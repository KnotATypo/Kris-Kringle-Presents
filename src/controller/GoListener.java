package controller;

import java.awt.event.ActionEvent;

import javax.swing.JCheckBox;

import model.Engine;
import view.Frame;

public class GoListener extends AbstractFrameListener
{
	private JCheckBox ignoreFamily;
	
	public GoListener(Engine engine, Frame frame, JCheckBox ignoreFamily)
	{
		super(engine, frame);
		this.ignoreFamily = ignoreFamily;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		engine.run(ignoreFamily.isSelected());
		frame.showResult();
	}

}
