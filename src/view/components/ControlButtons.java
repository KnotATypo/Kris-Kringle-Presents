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
	public ControlButtons(Engine engine, Frame frame)
	{
		setLayout(new FlowLayout());
		
		JButton go = new JButton("Go");
		JCheckBox ignoreFamily = new JCheckBox("Ignore families");

		go.addActionListener(new GoListener(engine, frame));

		add(go);
		add(ignoreFamily);
	}
}
