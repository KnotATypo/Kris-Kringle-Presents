package view.panels;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
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
		ControlPanel controls = new ControlPanel(engine, frame);
		
		familyPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 1, Color.black));
		settings.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
		memberPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
		
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
