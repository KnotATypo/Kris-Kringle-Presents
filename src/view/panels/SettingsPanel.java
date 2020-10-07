package view.panels;

import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
