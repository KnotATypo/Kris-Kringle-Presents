package view.components;

import java.awt.BorderLayout;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Engine;
import model.Family;

@SuppressWarnings("serial")
public class Table extends JComponent
{
	JTable table;
	Engine engine;
	DefaultTableModel dtm;

	public Table(Engine engine)
	{
		setLayout(new BorderLayout());

		this.engine = engine;
		dtm = new DefaultTableModel();
		table = new JTable(dtm);

		add(table.getTableHeader(), BorderLayout.NORTH);
		add(table, BorderLayout.CENTER);
	}

	public void updateData(Map<String, Family> data)
	{
		dtm = new DefaultTableModel();
		table.setModel(dtm);

		for (Entry<String, Family> family : data.entrySet())
			dtm.addColumn(family.getKey(), family.getValue().toVector());

	}

	public String getSelected()
	{
		return (String) dtm.getValueAt(table.getSelectedRow(),
				table.getSelectedColumn());
	}
}
