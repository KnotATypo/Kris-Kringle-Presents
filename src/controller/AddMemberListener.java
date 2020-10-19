package controller;

import view.Frame;
import view.components.ComboBox;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class AddMemberListener extends AbstractListener
{
    private final JTextField field;
    private final ComboBox familySelection;

    public AddMemberListener(Frame frame, JTextField field,
                             ComboBox familySelection)
    {
        super(frame);
        this.field = field;
        this.familySelection = familySelection;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        engine.addMember(familySelection.getSelectedItem(), field.getText());
        field.setText("");

        frame.updateData(true);
    }

}
