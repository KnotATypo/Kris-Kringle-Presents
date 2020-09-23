package view.panels;

import java.awt.BorderLayout;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import view.Frame;
import view.components.ControlButtons;

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
