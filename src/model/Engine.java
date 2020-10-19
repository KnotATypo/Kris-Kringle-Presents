package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Engine
{
    private final Map<String, Family> families = new HashMap<>();

    public void newFamily(String name)
    {
        families.put(name, new Family());
    }

    public void addMember(String familyName, String member)
    {
        Family family = families.get(familyName);
        family.addMember(member);
    }

    public Map<String, Family> getFamilies()
    {
        return families;
    }

    public void run(boolean ignoreFamily)
    {
        List<Person> used = new ArrayList<>();

        for (Entry<String, Family> entry : families.entrySet())
        {
            Family family = entry.getValue();
            for (int i = 0; i < family.getSize(); i++)
            {
                Person person = family.getPerson(i);
                List<Person> available = availablePeople(used, family,
                        ignoreFamily, person);

                int randNum = 0;
                if (available.size() != 0)
                    randNum = random(available.size() - 1);

                Person chosen = available.get(randNum);

                person.setGiftTo(chosen);
                used.add(chosen);
            }
        }
    }

    private List<Person> availablePeople(List<Person> used, Family currFam,
                                         boolean ignoreFamily, Person currPerson)
    {
        List<Person> available = new ArrayList<>();

        for (Entry<String, Family> entry : families.entrySet())
        {
            Family family = entry.getValue();
            if (ignoreFamily || family != currFam)
            {
                for (Person person : family.toArray())
                {
                    if (!used.contains(person) && person != currPerson)
                        available.add(person);
                }
            }
        }

        return available;
    }

    public void removeMember(String nameToRemove)
    {
        topLoop:
        for (Entry<String, Family> entry : families.entrySet())
        {
            Family family = entry.getValue();
            for (String person : family.toVector())
            {
                if (person.equals(nameToRemove))
                {
                    family.remove(person);
                    break topLoop;
                }
            }
        }
    }

    private int random(int max)
    {
        return (int) (Math.random() * (max + 1));
    }
}
