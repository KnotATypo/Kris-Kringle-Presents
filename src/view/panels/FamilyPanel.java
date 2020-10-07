package view.panels;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.AddFamilyListener;
import view.Frame;
import view.components.Table;

@SuppressWarnings("serial")
public class FamilyPanel extends JPanel
{
	public FamilyPanel(Table table, Frame frame)
	{
		JTextField familyField = new JTextField();
		JButton familyButton = new JButton("New Family");

		AddFamilyListener listener = new AddFamilyListener(frame, familyField);

		familyButton.addActionListener(listener);
		familyField.addActionListener(listener);

		familyField.setColumns(10);

		add(familyButton);
		add(familyField);
	}
}
