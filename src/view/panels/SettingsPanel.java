package view.panels;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class SettingsPanel extends JPanel
{
	public SettingsPanel()
	{
		JLabel title = new JLabel("Settings:");
		add(title);
	}
}
