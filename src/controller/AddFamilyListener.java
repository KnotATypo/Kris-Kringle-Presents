package controller;

import view.Frame;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class AddFamilyListener extends AbstractListener
{
    private final JTextField field;

    public AddFamilyListener(Frame frame, JTextField field)
    {
        super(frame);
        this.field = field;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        engine.newFamily(field.getText());
        field.setText("");

        frame.updateData(false);
    }

}
