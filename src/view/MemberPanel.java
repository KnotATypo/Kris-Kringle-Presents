package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class MemberPanel extends JPanel
{
	public MemberPanel()
	{
		setLayout(new FlowLayout());
		
		JButton memberButton = new JButton("New Member");
		JTextField memberField = new JTextField();
		
		memberField.setColumns(10);
		
		add(memberButton);
		add(memberField);
	}
}
