package view.components;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

import controller.GoListener;
import model.Engine;
import view.Frame;

@SuppressWarnings("serial")
public class ControlButtons extends JLabel
{
	public ControlButtons(Engine engine, Frame frame, JCheckBox ignoreFamily)
	{
		setLayout(new FlowLayout());
		
		JButton go = new JButton("Go");

		go.addActionListener(new GoListener(engine, frame, ignoreFamily));

		add(go);
	}
}
