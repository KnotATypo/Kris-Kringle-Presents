package view.panels;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.GoListener;
import model.Engine;
import view.Frame;

@SuppressWarnings("serial")
public class ControlPanel extends JPanel
{
	public ControlPanel(Engine engine, Frame frame)
	{
		setLayout(new FlowLayout());
		
		JLabel title = new JLabel("Controls:");
		JButton go = new JButton("Go");
		
		go.addActionListener(new GoListener(engine, frame));
		
		add(title);
		add(go);
	}
}
