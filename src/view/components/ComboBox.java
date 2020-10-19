package view.components;

import model.Family;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

@SuppressWarnings("serial")
public class ComboBox extends JComponent
{
    private final JComboBox<String> selectionBox;
    private DefaultComboBoxModel<String> cbm;

    public ComboBox()
    {
        setLayout(new FlowLayout());

        cbm = new DefaultComboBoxModel<>();
        selectionBox = new JComboBox<>(cbm);

        add(selectionBox);
    }

    public void updateData(Map<String, Family> data)
    {
        cbm = new DefaultComboBoxModel<>();
        selectionBox.setModel(cbm);

        for (String familyName : data.keySet())
            cbm.addElement(familyName);
    }

    public String getSelectedItem()
    {
        return selectionBox.getSelectedItem().toString();
    }
}
