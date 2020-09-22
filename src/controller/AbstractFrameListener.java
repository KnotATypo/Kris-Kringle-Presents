package controller;

import model.Engine;
import view.Frame;

public abstract class AbstractFrameListener extends AbstractEngineListener
{
	protected Frame frame;
	
	public AbstractFrameListener(Engine engine, Frame frame)
	{
		super(engine);
		this.frame = frame;
	}
}
