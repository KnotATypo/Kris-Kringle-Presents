package view;

import model.Engine;
import model.Family;
import model.Person;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Map.Entry;
import java.util.Vector;

@SuppressWarnings("serial")
public class ResultWindow extends JFrame
{
    public ResultWindow(Engine engine)
    {
        super("Results");

        setLayout(new BorderLayout());

        Vector<String> header = new Vector<>();
        header.add("Gifter");
        header.add("Giftee");

        Vector<Vector<String>> data = new Vector<>();
        for (Entry<String, Family> entry : engine.getFamilies().entrySet())
        {
            Family family = entry.getValue();

            for (int i = 0; i < family.getSize(); i++)
            {
                Vector<String> vector = new Vector<>();
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

        setBounds(520, 320, 250, 300);
        setVisible(true);
    }
}
