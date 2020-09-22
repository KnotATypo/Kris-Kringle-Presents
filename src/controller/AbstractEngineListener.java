package controller;

import java.awt.event.ActionListener;

import model.Engine;

public abstract class AbstractEngineListener implements ActionListener
{
	protected Engine engine;
	
	public AbstractEngineListener(Engine engine)
	{
		this.engine = engine;
	}
}
