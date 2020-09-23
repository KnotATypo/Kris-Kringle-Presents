package view.components;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

import controller.GoListener;
import controller.RemoveListener;
import view.Frame;

@SuppressWarnings("serial")
public class ControlButtons extends JLabel
{
	public ControlButtons(Frame frame, JCheckBox ignoreFamily)
	{
		setLayout(new FlowLayout());

		JButton go = new JButton("Go");
		JButton remove = new JButton("Remove Selected");

		go.addActionListener(new GoListener(frame, ignoreFamily));
		remove.addActionListener(new RemoveListener(frame));

		add(go);
		add(remove);
	}
}
