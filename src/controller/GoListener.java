package controller;

import java.awt.event.ActionEvent;
import model.Engine;
import view.Frame;

public class GoListener extends AbstractFrameListener
{

	public GoListener(Engine engine, Frame frame)
	{
		super(engine, frame);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		engine.run();
		frame.showResult();
	}

}
