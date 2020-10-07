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

	public MemberPanel(Frame frame)
	{
		setLayout(new FlowLayout());

		engine = frame.getEngine();

		JButton memberButton = new JButton("New Member");
		JTextField memberField = new JTextField();
		familySelection = new ComboBox();

		AddMemberListener listener = new AddMemberListener(frame, memberField,
				familySelection);

		memberButton.addActionListener(listener);
		memberField.addActionListener(listener);

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
