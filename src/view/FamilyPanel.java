package view;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.AddFamilyListener;
import model.Engine;

@SuppressWarnings("serial")
public class FamilyPanel extends JPanel
{
	public FamilyPanel(Engine engine, Table table)
	{
		JTextField familyField = new JTextField();
		JButton familyButton = new JButton("New Family");

		familyButton.addActionListener(new AddFamilyListener(engine, table, familyField));

		familyField.setColumns(10);

		add(familyButton);
		add(familyField);
	}
}
