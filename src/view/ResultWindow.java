package view;

import java.awt.BorderLayout;
import java.util.Map.Entry;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Engine;
import model.Family;
import model.Person;

@SuppressWarnings("serial")
public class ResultWindow extends JFrame
{
	public ResultWindow(Engine engine)
	{
		super("Results");

		setLayout(new BorderLayout());

		Vector<String> header = new Vector<String>();
		header.add("Gifter");
		header.add("Giftee");

		Vector<Vector<String>> data = new Vector<Vector<String>>();
		for (Entry<String, Family> entry : engine.getFamilies().entrySet())
		{
			Family family = entry.getValue();

			for (int i = 0; i < family.getSize(); i++)
			{
				Vector<String> vector = new Vector<String>();
				Person person = family.getPerson(i);
				vector.add(person.name);
				vector.add(person.getGiftTo().name);
				data.add(vector);
			}
		}

		DefaultTableModel dtm = new DefaultTableModel(data, header);
		JTable table = new JTable(dtm);

		add(table.getTableHeader(), BorderLayout.NORTH);
		add(table, BorderLayout.CENTER);

		setBounds(520, 320, 300, 200);
		setVisible(true);
	}
}
