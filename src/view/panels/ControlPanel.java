package view.panels;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ControlPanel extends JPanel
{
	public ControlPanel()
	{
		JLabel title = new JLabel("Controls:");
		add(title);
	}
}
