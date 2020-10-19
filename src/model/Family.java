package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Family
{
    private final List<Person> family = new ArrayList<>();
    private int size;

    public Family()
    {
        size = 0;
    }

    public void addMember(String name)
    {
        family.add(new Person(name));
        size++;
    }

    public Vector<String> toVector()
    {
        Vector<String> returnVector = new Vector<>();

        for (Person person : family)
            returnVector.add(person.name);

        return returnVector;
    }

    public Person[] toArray()
    {
        Person[] array = new Person[size];

        for (int i = 0; i < size; i++)
            array[i] = family.get(i);

        return array;
    }

    public void remove(String name)
    {
        for (Person person : family)
        {
            if (person.name.equals(name))
            {
                family.remove(person);
                break;
            }
        }
        size--;
    }

    public boolean contains(Person person)
    {
        return family.contains(person);
    }

    public Person getPerson(int i)
    {
        return family.get(i);
    }

    public int getSize()
    {
        return size;
    }
}
