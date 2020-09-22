package controller;

import java.awt.event.ActionListener;

import model.Engine;
import view.Frame;

public abstract class AbstractListener implements ActionListener
{
	protected Engine engine;
	protected Frame frame;
	
	public AbstractListener(Engine engine, Frame frame)
	{
		this.engine = engine;
		this.frame = frame;
	}
}
