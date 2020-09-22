package view.panels;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.GoListener;
import model.Engine;

@SuppressWarnings("serial")
public class ControlPanel extends JPanel
{
	public ControlPanel(Engine engine)
	{
		setLayout(new FlowLayout());
		
		JLabel title = new JLabel("Controls:");
		JButton go = new JButton("Go");
		
		go.addActionListener(new GoListener(engine));
		
		add(title);
		add(go);
	}
}
