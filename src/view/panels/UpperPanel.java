package view.panels;

import view.Frame;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class UpperPanel extends JPanel
{
    private final MemberPanel memberPanel;

    public UpperPanel(Frame frame)
    {
        setLayout(new GridLayout(2, 2));

        JCheckBox ignoreFamily = new JCheckBox("Ignore families");

        FamilyPanel familyPanel = new FamilyPanel(frame);
        SettingsPanel settings = new SettingsPanel(ignoreFamily);
        memberPanel = new MemberPanel(frame);
        ControlPanel controls = new ControlPanel(frame, ignoreFamily);

        familyPanel.setBorder(
                BorderFactory.createMatteBorder(0, 0, 1, 1, Color.black));
        settings.setBorder(
                BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
        memberPanel.setBorder(
                BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));

        add(familyPanel);
        add(settings);
        add(memberPanel);
        add(controls);
    }

    public void updateData()
    {
        memberPanel.updateData();
    }
}
