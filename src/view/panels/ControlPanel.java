package view.panels;

import view.Frame;
import view.components.ControlButtons;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class ControlPanel extends JPanel
{
    public ControlPanel(Frame frame, JCheckBox ignoreFamily)
    {
        setLayout(new BorderLayout());

        JLabel title = new JLabel("Controls:", SwingConstants.CENTER);
        ControlButtons buttons = new ControlButtons(frame, ignoreFamily);

        add(title, BorderLayout.NORTH);
        add(buttons, BorderLayout.CENTER);
    }
}
