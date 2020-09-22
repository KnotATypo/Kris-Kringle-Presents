package view.panels;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.AddMemberListener;
import model.Engine;
import view.Frame;
import view.components.ComboBox;

@SuppressWarnings("serial")
public class MemberPanel extends JPanel
{
	private ComboBox familySelection;
	private Engine engine;
	
	public MemberPanel(Engine engine, Frame frame)
	{
		setLayout(new FlowLayout());
		
		this.engine = engine;
		
		JButton memberButton = new JButton("New Member");
		JTextField memberField = new JTextField();
		familySelection = new ComboBox();
		
		memberButton.addActionListener(new AddMemberListener(engine, frame, memberField, familySelection));
		
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
