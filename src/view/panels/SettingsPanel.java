package view.panels;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class SettingsPanel extends JPanel
{
    public SettingsPanel(JCheckBox ignoreFamily)
    {
        setLayout(new FlowLayout());

        JLabel title = new JLabel("Settings:");

        add(title);
        add(ignoreFamily);
    }
}
