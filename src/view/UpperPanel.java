package view;

import java.awt.GridLayout;

import javax.swing.JPanel;

import model.Engine;

@SuppressWarnings("serial")
public class UpperPanel extends JPanel
{
	public UpperPanel(Engine engine, Table table)
	{
		setLayout(new GridLayout(2, 1));

		FamilyPanel familyPanel = new FamilyPanel(engine, table);
		MemberPanel memberPanel = new MemberPanel();
		
		add(familyPanel);
		add(memberPanel);
	}
}
