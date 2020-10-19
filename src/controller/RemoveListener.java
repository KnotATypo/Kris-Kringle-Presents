package controller;

import view.Frame;

import java.awt.event.ActionEvent;

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
