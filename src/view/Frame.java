package view;

import model.Engine;
import view.components.Table;
import view.panels.UpperPanel;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Frame extends JFrame
{
    private final Engine engine;
    private final Table table;
    private final UpperPanel upperPanel;

    public Frame(Engine engine)
    {
        super("Kris Kringle Presents");
        setLayout(new GridLayout(2, 1));

        this.engine = engine;

        table = new Table(engine);
        upperPanel = new UpperPanel(this);

        upperPanel.setBorder(
                BorderFactory.createMatteBorder(0, 0, 2, 0, Color.black));

        add(upperPanel);
        add(table);

        setBounds(420, 220, 650, 460);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void updateData(boolean onlyTable)
    {
        table.updateData(engine.getFamilies());

        if (!onlyTable)
            upperPanel.updateData();
    }

    public void showResult()
    {
        new ResultWindow(engine);
    }

    public void removeMember()
    {
        engine.removeMember(table.getSelected());
    }

    public Engine getEngine()
    {
        return engine;
    }
}
