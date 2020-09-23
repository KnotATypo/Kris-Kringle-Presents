package controller;

import java.awt.event.ActionListener;

import model.Engine;
import view.Frame;

public abstract class AbstractListener implements ActionListener
{
	protected Frame frame;
	protected Engine engine;
	
	public AbstractListener(Engine engine, Frame frame)
	{
		this.frame = frame;
		this.engine = engine;
	}
}
