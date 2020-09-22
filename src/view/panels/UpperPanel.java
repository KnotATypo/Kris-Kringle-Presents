package view.panels;

import java.awt.GridLayout;
import javax.swing.JPanel;

import model.Engine;
import view.Frame;
import view.components.Table;

@SuppressWarnings("serial")
public class UpperPanel extends JPanel
{
	private MemberPanel memberPanel;
	
	public UpperPanel(Engine engine, Table table, Frame frame)
	{
		setLayout(new GridLayout(2, 2));

		FamilyPanel familyPanel = new FamilyPanel(engine, table, frame);
		SettingsPanel settings = new SettingsPanel();
		memberPanel = new MemberPanel(engine, frame);
		ControlPanel controls = new ControlPanel();
		
		add(familyPanel);
		add(settings);
		add(memberPanel);
		add(controls);
	}

	public void updateData()
	{
		memberPanel.updateData();
	}
}
