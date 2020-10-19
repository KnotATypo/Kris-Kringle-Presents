package controller;

import model.Engine;
import view.Frame;

import java.awt.event.ActionListener;

public abstract class AbstractListener implements ActionListener
{
    protected Frame frame;
    protected Engine engine;

    public AbstractListener(Frame frame)
    {
        this.frame = frame;
        engine = frame.getEngine();
    }
}
