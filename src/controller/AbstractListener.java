package controller;

import java.awt.event.ActionListener;

import model.Engine;

public abstract class AbstractListener implements ActionListener
{
	protected Engine engine;
	
	public AbstractListener(Engine engine)
	{
		this.engine = engine;
	}
}
