package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Engine;

@SuppressWarnings("serial")
public class MemberPanel extends JPanel
{
	private ComboBox familySelection;
	private Engine engine;
	
	public MemberPanel(Engine engine)
	{
		setLayout(new FlowLayout());
		
		this.engine = engine;
		
		JButton memberButton = new JButton("New Member");
		JTextField memberField = new JTextField();
		familySelection = new ComboBox();
		
		memberField.setColumns(10);
		
		add(memberButton);
		add(familySelection);
		add(memberField);
	}

	public void updateData()
	{
		familySelection.updateData(engine.getFamilies());
	}
}
