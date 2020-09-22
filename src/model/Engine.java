package model;

import java.util.HashMap;
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

	public void run()
	{
		for (Entry<String, Family> entry : families.entrySet())
		{
			Family family = entry.getValue();
			for (int i = 0; i < family.getSize(); i++)
			{
				Person person = family.getPerson(i);
				assignGiftee(person);
			}
		}
	}
	
	private void assignGiftee(Person person)
	{
		int randomNum = random(families.size());
	}

	private int random(int max)
	{
		return (int) (Math.random() * (max + 1));
	}
}
