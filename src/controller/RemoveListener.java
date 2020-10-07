package controller;

import java.awt.event.ActionEvent;
import view.Frame;

public class RemoveListener extends AbstractListener
{

	public RemoveListener(Frame frame)
	{
		super(frame);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		frame.removeMember();
		frame.updateData(true);
	}

}
