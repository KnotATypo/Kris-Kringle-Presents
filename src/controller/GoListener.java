package controller;

import java.awt.event.ActionEvent;

import javax.swing.JCheckBox;

import view.Frame;

public class GoListener extends AbstractListener
{
	private JCheckBox ignoreFamily;

	public GoListener(Frame frame, JCheckBox ignoreFamily)
	{
		super(frame);
		this.ignoreFamily = ignoreFamily;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		boolean success = false;
		int index = 1;
		
		while (!success)
		{
			try
			{
				engine.run(ignoreFamily.isSelected());
				success = true;
			} catch (Exception exeption)
			{
				System.out.println("Attempt: " + index++);
			}
		}

		frame.showResult();
	}

}
