package view.panels;

import controller.AddFamilyListener;
import view.Frame;

import javax.swing.*;

@SuppressWarnings("serial")
public class FamilyPanel extends JPanel
{
    public FamilyPanel(Frame frame)
    {
        JTextField familyField = new JTextField();
        JButton familyButton = new JButton("New Family");

        AddFamilyListener listener = new AddFamilyListener(frame, familyField);

        familyButton.addActionListener(listener);
        familyField.addActionListener(listener);

        familyField.setColumns(10);

        add(familyButton);
        add(familyField);
    }
}
