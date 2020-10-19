package view.panels;

import controller.AddMemberListener;
import model.Engine;
import view.Frame;
import view.components.ComboBox;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class MemberPanel extends JPanel
{
    private final ComboBox familySelection;
    private final Engine engine;

    public MemberPanel(Frame frame)
    {
        setLayout(new FlowLayout());

        engine = frame.getEngine();

        JButton memberButton = new JButton("New Member");
        JTextField memberField = new JTextField();
        familySelection = new ComboBox();

        AddMemberListener listener = new AddMemberListener(frame, memberField,
                familySelection);

        memberButton.addActionListener(listener);
        memberField.addActionListener(listener);

        memberField.setColumns(10);

        add(memberButton);
        add(familySelection);
        add(memberField);
    }

    public void updateData()
    {
        familySelection.updateData(engine.getFamilies());
    }
}
