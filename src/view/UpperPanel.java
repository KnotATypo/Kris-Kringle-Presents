package view;

import java.awt.GridLayout;
import javax.swing.JPanel;

import model.Engine;

@SuppressWarnings("serial")
public class UpperPanel extends JPanel
{
	private MemberPanel memberPanel;
	
	public UpperPanel(Engine engine, Table table, Frame frame)
	{
		setLayout(new GridLayout(2, 1));

		FamilyPanel familyPanel = new FamilyPanel(engine, table, frame);
		memberPanel = new MemberPanel(engine);
		
		add(familyPanel);
		add(memberPanel);
	}

	public void updateData()
	{
		memberPanel.updateData();
	}
}
