package controller;

import java.awt.event.ActionEvent;
import model.Engine;
import view.Frame;

public class RemoveListener extends AbstractListener
{

	public RemoveListener(Engine engine, Frame frame)
	{
		super(engine, frame);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		frame.removeMember();
		frame.updateData(false);
	}

}
