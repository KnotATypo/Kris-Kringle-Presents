package controller;

import java.awt.event.ActionEvent;
import model.Engine;

public class GoListener extends AbstractEngineListener
{

	public GoListener(Engine engine)
	{
		super(engine);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		engine.run();
	}

}
