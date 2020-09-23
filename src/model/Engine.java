package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Engine
{
	private Map<String, Family> families = new HashMap<String, Family>();

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

	public int highNumOfMembers()
	{
		int most = 0;

		for (Family family : families.values())
		{
			int size = family.getSize();
			if (size > most)
				most = size;
		}

		return most;
	}

	public void run(boolean ignoreFamily)
	{
		for (Entry<String, Family> entry : families.entrySet())
		{
			Family family = entry.getValue();
			for (int i = 0; i < family.getSize(); i++)
				assignGiftees(family, ignoreFamily);
		}
	}

	private void assignGiftees(Family family, boolean ignoreFamily)
	{
		List<String> familyNames = new ArrayList<String>(families.keySet());
		List<Person> used = new ArrayList<Person>();

		for (int i = 0; i < family.getSize(); i++)
		{
			Person person = family.getPerson(i);
			boolean stop = true;

			while (stop)
			{	
				int randFamNum = random(familyNames.size() - 1);
				Family chosenFamily = families.get(familyNames.get(randFamNum));
				
				if (ignoreFamily || chosenFamily != family)
				{
					int randPerNum = random(chosenFamily.getSize() - 1);
					Person chosenPerson = chosenFamily.getPerson(randPerNum);

					if (!used.contains(chosenPerson)
							&& !chosenPerson.equals(person))
					{
						person.setGiftTo(chosenPerson);
						used.add(chosenPerson);
						stop = false;
					}
				}
			}
		}
	}

	private int random(int max)
	{
		return (int) (Math.random() * (max + 1));
	}
}
