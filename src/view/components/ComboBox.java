package view.components;

import java.awt.FlowLayout;
import java.util.Map;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JComponent;

import model.Family;

@SuppressWarnings("serial")
public class ComboBox extends JComponent
{
	private JComboBox<String> selectionBox;
	private DefaultComboBoxModel<String> cbm;
	
	public ComboBox()
	{
		setLayout(new FlowLayout());
		
		cbm = new DefaultComboBoxModel<String>();
		selectionBox = new JComboBox<String>(cbm);
		
		add(selectionBox);
	}
	
	public void updateData(Map<String, Family> data)
	{
		cbm = new DefaultComboBoxModel<String>();
		selectionBox.setModel(cbm);
		
		for(String familyName : data.keySet())
			cbm.addElement(familyName);
	}
	
	public String getSelectedItem()
	{
		return selectionBox.getSelectedItem().toString();
	}
}
